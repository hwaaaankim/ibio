package com.dev.IBIOECommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.IBIOECommerce.model.authentication.Member;
import com.dev.IBIOECommerce.service.authentication.MemberService;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

	@Autowired
	MemberService memberService;
	
	@PostMapping("/insertMember")
	public String insertMember(Member member) {
		memberService.insertAdmin(member);
		return "success";
	}
}
