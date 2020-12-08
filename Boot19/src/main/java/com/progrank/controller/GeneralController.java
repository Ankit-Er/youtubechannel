package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("access")
public class GeneralController {

	@ResponseBody
	@GetMapping("/")
	public String home() {
		return "This is not protected :)";
	}
}
