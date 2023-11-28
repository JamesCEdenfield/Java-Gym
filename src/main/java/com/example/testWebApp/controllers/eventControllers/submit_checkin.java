package com.example.testWebApp.controllers.eventControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testWebApp.services.member.CheckInService;

@RestController
public class submit_checkin {

	private CheckInService checkInService;
	
	@Autowired
	public submit_checkin(CheckInService checkInService) {
		this.checkInService = checkInService;
	}
	
	@GetMapping("submit_checkin")
	public int getGymID(@RequestParam("javaGymID") int gymID) {
		return checkInService.getGymID(gymID);
	}
}
