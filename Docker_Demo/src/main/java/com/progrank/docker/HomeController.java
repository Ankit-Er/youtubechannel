package com.progrank.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping("/index")
	public String sayHello() {
		return "Hello Docker !!";
	}
}
