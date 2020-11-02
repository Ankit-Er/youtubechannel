package com.progrank.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.progrank.security.entity.User;
import com.progrank.security.service.MyUserService;

@RestController
public class HomeController {

	@Autowired
	MyUserService service;
	
	@GetMapping("/index")
	public String sayHi() {
		return "Hi Spring Security Using UserDetailsManager !!";
	}
	
	@PostMapping("/createUser")
	public void addUser(@RequestBody User user) {
		service.addUser(user);
	}
	
}
