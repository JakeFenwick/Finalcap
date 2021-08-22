package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class LoanController {
    @GetMapping
    String getHome(Model model) {
        model.addAttribute("Intro","Welcome to the loan calculator");
        return "Loan";
    }
}
