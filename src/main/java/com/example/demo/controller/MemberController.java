package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MemberAccount;
import com.example.demo.services.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/addMemberAccount")
	public String hello() {
		memberAccount = new MemberAccount();
		memberAccount.setPassword("12345678");
		memberAccount.setEmail("test@gamail.com");
		memberAccount.setCellphone("09123445566");
		memberAccount.setAddress("台北市");
		memberService.addMember(memberAccount);
		
		return "新增會員成功";
	}
	
}
