package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.MemberDao;
import com.example.demo.models.MemberAccount;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;
	// 呼叫 	memberDao 的 addMember function
	public void addMember(MemberAccount memberAccount) {
		memberDao.addMember(memberAccount);
	}
	
}
