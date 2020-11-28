package com.progrank.security.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Video No: 9 , 10
@RestController
public class HomeController {

	@GetMapping("/hello")
	public String sayHi() {
		Authentication auth = 
				SecurityContextHolder
				.getContext().
				getAuthentication();
		
		System.out.println(auth.getName());
		return "Hi Authenticated Object ??" ;
	}
	
}
