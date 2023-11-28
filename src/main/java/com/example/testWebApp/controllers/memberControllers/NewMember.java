package com.example.testWebApp.controllers.memberControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.example.testWebApp.services.member.NewMemberService;

@Controller
public class NewMember {
	
	public NewMemberService newMemberService;
	
	@Autowired
	public NewMember(NewMemberService newMemberService) {
		this.newMemberService = newMemberService;
	}
	
	
	@GetMapping("new-member")
	public String createMember() {
		return newMemberService.createMember();
	}
	
}
