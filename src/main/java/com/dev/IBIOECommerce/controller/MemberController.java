package com.dev.IBIOECommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

	@GetMapping({"" , "/index"})
	@ResponseBody
	public String memberIndex() {
		
		return "memberIndex";
	}
}
