package pl.com.progrex88.homefinanceapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.com.progrex88.homefinanceapp.services.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping({"/user","/user.html"})
    public String user(Model model){

        model.addAttribute("users", userService.findAll());

        return "persons/user/index-user";
    }
}
