package com.example.testWebApp.controllers.eventControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.testWebApp.services.member.SubmitRevokeService;

@RestController
public class submit_revoke {
	private SubmitRevokeService submitRevokeService;
	
	@Autowired
	public submit_revoke(SubmitRevokeService submitRevokeService) {
		this.submitRevokeService = submitRevokeService;
	}
	
	@GetMapping("revoke_membership")
	public int getGymID(@RequestParam("membershipID") int gymID) {
		return submitRevokeService.getGymID(gymID);
	}
}
