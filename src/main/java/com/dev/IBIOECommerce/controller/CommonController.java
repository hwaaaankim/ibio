package com.dev.IBIOECommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommonController {

	
	@GetMapping({"/", "/index"})
	public String index() {
		
		return "front/index";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		
		return "front/login";
				
	}
	
	@PostMapping("/signinProcess")
	public String loginProcess() {
		
		return "front/index";
	}
}
