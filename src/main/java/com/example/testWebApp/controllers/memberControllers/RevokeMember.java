package com.example.testWebApp.controllers.memberControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.example.testWebApp.services.member.RevokeMemberService;

@Controller
public class RevokeMember {

	public final RevokeMemberService revokeMemberService;
	
	@Autowired
	public RevokeMember(RevokeMemberService revokeMemberService) {
		this.revokeMemberService = revokeMemberService;
	}
	
	@GetMapping("revoke-member")
	public String revokeMembership() {
		return revokeMemberService.revokeMembership();
	}
	
}
