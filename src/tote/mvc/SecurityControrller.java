package tote.mvc;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tote.entity.Category;
import tote.service.CategoryService;

@Controller
@RequestMapping(value = "/admin")
public class SecurityControrller {

    @Autowired
    private CategoryService catSrv;

    @GetMapping("/admin.html")
    public String getDiscipline(Principal principal, Model model) {
        model.addAttribute("categories", catSrv.getCategory());
        return "admin/add-discipline";
    }

    @PostMapping("/add-dis.html")
    public String addDiscipline(@RequestParam("discipline") String discipline, Model model) {
        Category category = new Category(discipline);
        catSrv.add(category);
        model.addAttribute("categories", catSrv.getCategory());
        return "redirect:/admin/admin.html";
    }

    @PostMapping("/admin.html")
    public String addDiscipline() {
        return "admin/add-discipline";
    }

}
