package tote.mvc;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tote.service.CategoryService;

@Controller
public class UsersController {

    @Autowired
    private CategoryService catSrv;

    @GetMapping({ "/main.html", "/index.html" })
    public String start(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("username", principal.getName());
        }
        model.addAttribute("categories", catSrv.getCategory());
        return "main";
    }

    @GetMapping("/feedback.html")
    public String feedback(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("username", principal.getName());
        }
        return "user/feedback";
    }

    @GetMapping("/error.html")
    public String error(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("username", principal.getName());
        }
        return "error";
    }
}
