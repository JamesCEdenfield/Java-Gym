package com.example.testWebApp.models.member;

import java.time.LocalDate;

public class revokedMember extends member {
	private String reason;
	private LocalDate revokeDate;

	public revokedMember(Long id, String fName, String lName, int age, int gymID, LocalDate joinDate,
			LocalDate lastVisit, String reason, LocalDate revokeDate) {
		super(id, fName, lName, age, gymID, joinDate, lastVisit);
		this.reason = reason;
		this.revokeDate = revokeDate;
	}
	
	public String getReason() {
		return this.reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public LocalDate getRevokeDate() {
		return this.revokeDate;
	}
	
	public void setRevokeDate(LocalDate revokeDate) {
		this.revokeDate = revokeDate;
	}
}
