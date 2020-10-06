package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.progrank.model.UserLogin;

@Controller
public class LoginController {

	
	@RequestMapping("/")
	public String login(@ModelAttribute("objUser") UserLogin user) {
		return "login";
	}

	@RequestMapping("/login-panel")
	public String home(@ModelAttribute("objUser") UserLogin login, Model model, @RequestParam("action") String click) {

		if (click.equalsIgnoreCase("login")) {
			// get data from db

			if (login.getUserName().equals("Abhi") && login.getUserPasswd().equals("789")) {
				return "home";
			} else {
				model.addAttribute("msg", "Invalid !! ");
				return "login";
			}
		} else if (click.equalsIgnoreCase("register now")) {
			return "redirect:/registration";
		}
		return "login";
	}

}
