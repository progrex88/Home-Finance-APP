package pl.com.progrex88.homefinanceapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @RequestMapping({"/account","/account.html"})
    public String account(){

        return "persons/user/account/index-account";
    }
}
