package tote.mvc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tote.entity.Bet;
import tote.entity.Event;
import tote.entity.Result;
import tote.entity.User;
import tote.service.BetService;
import tote.service.CategoryService;
import tote.service.EventService;
import tote.service.ResultService;
import tote.service.UserService;

@Controller
@RequestMapping(value = "/admin")
public class OutcomeController {

    @Autowired
    private UserService userSrv;
    @Autowired
    private CategoryService catSrv;

    @Autowired
    private EventService eventSvr;

    @Autowired
    private ResultService resultSrv;

    @Autowired
    private BetService betSrv;

    @GetMapping("/add-outcome.html")
    public String getOutcome(Model model) {
        model.addAttribute("categories", catSrv.getCategory());
        model.addAttribute("events", eventSvr.getEvent());
        return "admin/add-outcome";
    }

    @PostMapping("/add-out.html")
    public String addOutcome(Model model, @RequestParam("discipline") Long idCategory,
            @RequestParam("event") Long idevent, @RequestParam("outcome") String name,
            @RequestParam("coeff") Double coeff) {
        Result res = new Result(name, coeff, idevent);
        resultSrv.add(res);
        model.addAttribute("categories", catSrv.getCategory());
        model.addAttribute("events", eventSvr.getEvent());
        return "redirect:/admin/add-outcome.html";
    }

    @PostMapping("/add-outcome.html")
    public String addOutcome(Model model) {
        model.addAttribute("categories", catSrv.getCategory());
        return "admin/add-outcome";
    }

    @GetMapping("/state-outcomes.html")
    public String getOutcomes(Model model) {

        List<Event> events = eventSvr.getEvent();
        for (Event i : events) {
            i.setResults(resultSrv.findByEventId(i.getId()));
        }
        model.addAttribute("events", events);
        return "admin/state-outcomes";
    }

    @PostMapping("/state-outcomes.html")
    public String setOutcomes(Model model, @RequestParam("betId") Long id, @RequestParam("state") int state) {
        Result result = resultSrv.getResult(id);
        result.setState(state);
        if (state == 1) {
            for (Bet i : betSrv.getBets()) {
                if (i.getIdRes() == id) {
                    User user = userSrv.getUser(i.getIdUser());
                    user.setBillValue(
                            user.getBillValue().add(i.getBetValue().multiply(new BigDecimal(result.getCoef())))
                                    .setScale(2, RoundingMode.CEILING));
                    userSrv.save(user);
                }
            }
        }
        resultSrv.save(result);
        List<Event> events = eventSvr.getEvent();
        for (Event i : events) {
            i.setResults(resultSrv.findByEventId(i.getId()));
        }
        model.addAttribute("events", events);
        return "admin/state-outcomes";
    }
}
