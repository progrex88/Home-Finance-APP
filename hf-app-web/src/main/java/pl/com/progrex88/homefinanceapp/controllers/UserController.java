package pl.com.progrex88.homefinanceapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping({"/user","/user.html"})
    public String user(){

        return "persons/user/index-user";
    }
}
