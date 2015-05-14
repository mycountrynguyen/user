package com.dhan.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping(value = "/")
    public String user(Model model) {
        model.addAttribute("name", "Hung Le");
        return "home";
    }
    
    @RequestMapping(value = "/login")
    public String login(Model model) {
        model.addAttribute("name", "Hung Le");
        return "login";
    }
}
