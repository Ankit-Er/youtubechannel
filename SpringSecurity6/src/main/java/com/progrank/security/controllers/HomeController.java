package com.progrank.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/hello")
	public String sayHi() {
		return "Hi 2 step Authentication ??";
	}
	
}
