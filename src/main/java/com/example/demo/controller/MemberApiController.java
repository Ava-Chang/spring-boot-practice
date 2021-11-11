package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.MemberAccount;

// 使用此註解可以回傳 json 格式
@RestController
public class MemberApiController {
	// 當需要用其他 class 時可以用此註解	
	@Autowired
	MemberAccount memberAccount;

	//純粹 return json 格式	
	@RequestMapping("/memberApi/memberTest")
	public MemberAccount memberTest() {
		MemberAccount memberAccount = new MemberAccount();
		memberAccount.setAddress("台北市");
		memberAccount.setCellphone("09123456789");
		memberAccount.setEmail("test@gmail.com");
		memberAccount.setId(1);
		memberAccount.setPassword("123456789");
		return memberAccount;
	}
}
