package com.progrank.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "home.html";
	}
	
	
	@PostMapping("/saveData")
	public String home(String uname) {
		System.out.println(uname);
		return "home.html";
	}
	
	
}
