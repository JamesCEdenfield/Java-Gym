package com.example.testWebApp.controllers.eventControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.testWebApp.models.member.member;
import com.example.testWebApp.repos.memberRepo;

@Controller
public class submit_registration {
	
	@Autowired
	private final memberRepo MemberRepo;
	
	public submit_registration(memberRepo MemberRepo) {
		this.MemberRepo = MemberRepo;
	}
	
	@PostMapping("/submit_registration")
	public String saveMember(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName, @RequestParam("age") int age)
	{
		
		member newMem = new member();
		newMem.setFname(firstName);
		newMem.setLname(lastName);
		newMem.setAge(age);
		MemberRepo.save(newMem);
		
		return "welcome";
	}
	
	
	
	@GetMapping("/display_user")
	public List<member> getUser() {
		return MemberRepo.findAll();
	}
}
