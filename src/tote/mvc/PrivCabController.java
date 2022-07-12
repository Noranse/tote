package tote.mvc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Principal;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tote.entity.BetAll;
import tote.entity.User;
import tote.service.BetServiceImpl;
import tote.service.UserServiceImpl;

@Controller
public class PrivCabController {

    private static final int MAX_BILL_VALUE = 100000;

    @Autowired
    private UserServiceImpl userSrv;

    @Autowired
    private BetServiceImpl betSrv;

    @GetMapping("/private_cabinet.html")
    public String privateCabinet(Model model, Principal principal) {
        User user = userSrv.getUser(principal.getName());
        List<BetAll> bets = betSrv.getBetsAll(user.getId());
        for (BetAll i : bets) {
            if (i.getState() == 1) {
                i.setWinSum(i.getBetValue().multiply(new BigDecimal(i.getResCoef())).setScale(2, RoundingMode.CEILING));
            } else {
                i.setWinSum(BigDecimal.ZERO);
            }
        }
        Collections.reverse(bets);
        model.addAttribute("betsAll", bets);
        if (principal != null) {
            model.addAttribute("username", principal.getName());
        }
        model.addAttribute("balance", user.getBillValue());
        return "privatecabinet/private_cabinet";
    }

    @GetMapping("/betUp.html")
    public String betup(Model model, Principal principal) {
        User user = userSrv.getUser(principal.getName());
        if (principal != null && user.getBillValue().compareTo(new BigDecimal(MAX_BILL_VALUE)) == -1) {
            user.setBillValue(user.getBillValue().multiply(new BigDecimal(2)).abs().setScale(2, RoundingMode.CEILING));
            userSrv.save(user);
            model.addAttribute("username", user.getName());
        }
        model.addAttribute("betsAll", betSrv.getBetsAll(user.getId()));
        model.addAttribute("balance", user.getBillValue());
        return "redirect:/private_cabinet.html";
    }
}
