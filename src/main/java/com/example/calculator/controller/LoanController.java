package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class LoanController {
    @GetMapping
    String getHome(Model model) {
        model.addAttribute("Home","Welcome to the loan calculator");
        return "index";
    }
}
