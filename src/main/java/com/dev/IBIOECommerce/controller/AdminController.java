package com.dev.IBIOECommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping({"" , "/"})
	public String adminIndex() {
		
		return "administration/common/index";
	} 
}
