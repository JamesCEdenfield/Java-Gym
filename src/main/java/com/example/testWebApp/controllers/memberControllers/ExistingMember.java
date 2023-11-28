package com.example.testWebApp.controllers.memberControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.example.testWebApp.services.member.ExistingMemberService;

@Controller
public class ExistingMember {

	public final ExistingMemberService existingMemberService;
	
	@Autowired
	public ExistingMember(ExistingMemberService existingMemberService) {
		this.existingMemberService = existingMemberService;
	}
	
	
	@GetMapping("existing-member")
	public String checkIn() {
		return existingMemberService.checkIn();
	}

}
