package pl.com.progrex88.homefinanceapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    @RequestMapping({"/person","/person.html"})
    public String person(){

        return "persons/index-person";
    }
}
