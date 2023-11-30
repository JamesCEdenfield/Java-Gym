package com.example.testWebApp.controllers.eventControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;

import com.example.testWebApp.models.member.member;
import com.example.testWebApp.repos.memberRepo;

@RestController
public class submit_registration {
	
	@Autowired
	private final memberRepo MemberRepo;
	
	public submit_registration(memberRepo MemberRepo) {
		this.MemberRepo = MemberRepo;
	}
	
	@PostMapping("submit_registration")
	public String saveMember(@RequestBody member Member) {
		MemberRepo.save(Member);
		return "index";
	}
	
	
	
	@GetMapping("/display_user")
	public List<member> getUser() {
		return MemberRepo.findAll();
	}
}
