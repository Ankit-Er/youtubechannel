package com.progrank.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@GetMapping("/myapp")
	public String home() {
		return "home.html";
	}
	
	
	@PostMapping("/accessData")
	@ResponseBody
	@CrossOrigin("http://localhost:8083")
	public String resource() {
		//System.out.println("i am calling!!");
		return "Hello Resource!!";
	}
	
	
}
