package com.progrank.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@GetMapping("/consumerApp")
	public String home() {
		return "home.html";
	}
	
}
