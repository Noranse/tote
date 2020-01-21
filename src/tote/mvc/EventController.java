package tote.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tote.entity.Event;
import tote.service.CategoryService;
import tote.service.EventService;

@Controller
@RequestMapping(value = "/admin")
public class EventController {

    @Autowired
    private CategoryService catSrv;

    @Autowired
    private EventService eventSvr;

    @GetMapping("/add-event.html")
    public String getEvent(Model model) {
        model.addAttribute("categories", catSrv.getCategory());
        return "admin/add-event";
    }

    @PostMapping("/add-eve.html")
    public String addEvent(Model model, @RequestParam("discipline") Long idCategory, @RequestParam("event") String name,
            @RequestParam("date") String date) {
        Event event = new Event(date, idCategory, name);
        eventSvr.add(event);
        System.out.println(event.getName() + "added\n\n");
        model.addAttribute("categories", catSrv.getCategory());
        return "redirect:/admin/add-event.html";
    }

    @PostMapping("/add-event.html")
    public String addEvent() {
        return "admin/add-event";
    }
}
