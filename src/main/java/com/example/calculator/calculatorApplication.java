package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class calculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(calculatorApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Loan Calculator";
	}
}
