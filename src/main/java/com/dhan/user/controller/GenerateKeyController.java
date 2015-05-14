package com.dhan.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenerateKeyController {
    @RequestMapping(value = "/genkey")
    public String genkey(Model model) {
        return "genkey";
    }
}
