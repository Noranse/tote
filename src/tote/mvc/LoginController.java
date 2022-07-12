package tote.mvc;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tote.entity.User;
import tote.service.UserService;

@Controller
public class LoginController {

    private static final double INITIAL_CAPITAL = 200.0;

    @Autowired
    private UserService userSrv;

    @GetMapping("/registration.html")
    public String reg() {
        return "user/registration";
    }

    @PostMapping("/registration.html")
    public String addUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (userSrv.getUser(username) != null) {
            return "user/registration";
        }
        User user = new User();
        user.setName(username);
        user.setPass(password);
        user.setBillValue(new BigDecimal(INITIAL_CAPITAL));
        userSrv.save(user);
        return "redirect: login.html";
    }

    @RequestMapping("/login")
    public String auth() {
        return "user/authorization";
    }
}
