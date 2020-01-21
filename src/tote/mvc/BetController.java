package tote.mvc;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tote.entity.Bet;
import tote.entity.Event;
import tote.entity.User;
import tote.service.BetService;
import tote.service.EventService;
import tote.service.ResultService;
import tote.service.UserService;

@Controller
public class BetController {

    @Autowired
    private EventService eventService;

    @Autowired
    private ResultService resSrv;

    @Autowired
    private BetService betSrv;

    @Autowired
    private UserService userSrv;

    @GetMapping("/bets.html")
    public String bets(Model model, Principal principal) {
        List<Event> events = eventService.getEvent();
        for (Event i : events) {
            i.setResults(resSrv.findByEventId(i.getId()));
        }
        if (principal != null) {
            model.addAttribute("username", principal.getName());
        }
        Collections.reverse(events);
        model.addAttribute("events", events);
        return "privatecabinet/bets";
    }

    @GetMapping("/addbet.html")
    public String addbet(Model model, @RequestParam("coeff[]") Long[] resId, @RequestParam("bet") BigDecimal bet,
            Principal principal) {
        User user = userSrv.getUser(principal.getName());
        for (Long i : resId) {
            user.setBillValue(user.getBillValue().subtract(bet));
            Bet b = new Bet();
            b.setIdRes(i);
            b.setBetValue(bet);
            b.setIdUser(user.getId());
            betSrv.save(b);
        }
        userSrv.save(user);

        List<Event> events = eventService.getEvent();
        for (Event i : events) {
            i.setResults(resSrv.findByEventId(i.getId()));
        }
        model.addAttribute("events", events);
        if (principal != null) {
            model.addAttribute("username", principal.getName());
        }
        return "privatecabinet/bets";
    }
}
