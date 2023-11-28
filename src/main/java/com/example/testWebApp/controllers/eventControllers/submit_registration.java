package com.example.testWebApp.controllers.eventControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.testWebApp.services.member.RegistrationService;

@RestController
public class submit_registration {
	
	private final RegistrationService registrationService;
	
	@Autowired
	public submit_registration(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}
	
	
	@GetMapping("submit_registration")
	public String getUser(@RequestParam("firstName") String firstName, @RequestParam("lastName")String lastName, @RequestParam("age") int age) {
		return registrationService.getUser(firstName, lastName, age);
	}
}
