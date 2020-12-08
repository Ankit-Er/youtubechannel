package com.progrank.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.progrank.entity.User;

@Controller
public class HomeController {

	
	//this is secure (home page)
	@GetMapping("/")
	public String login(User user) {
		return "home";
	}
	
	
	//this is accessible (public)
	@GetMapping("/my-login-form")
	public String login() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(User user) {
		return "login";
	}
	
}
