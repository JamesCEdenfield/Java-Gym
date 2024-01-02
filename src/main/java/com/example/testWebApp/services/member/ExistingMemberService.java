package com.example.testWebApp.services.member;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testWebApp.models.member.member;
import com.example.testWebApp.repos.memberRepo;

@Service
public class ExistingMemberService {
	
	public final memberRepo memberRepository;
	
	@Autowired
	public ExistingMemberService(memberRepo memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	public member checkIn(Long memberID) {
		Long yourIdLong = Long.valueOf(2); 
		
		Optional<member> foundMember = memberRepository.findById(yourIdLong);
	    return foundMember.orElse(null); // or handle if not found
		
	}
}
