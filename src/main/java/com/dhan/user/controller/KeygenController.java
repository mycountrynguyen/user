package com.dhan.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KeygenController {
    @RequestMapping(value = "/keygen")
    public String genkey(Model model) {
        return "keygen";
    }
}
