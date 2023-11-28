package com.example.testWebApp.services.member;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
	public String getUser(String firstName, String lastName, int age) {
		return " ["
				+ "{first_name : " + firstName + " ,\n " 
						+ "last_name : " + lastName + " ,\n "
								+ "age : " + age + "}" 
										+ "]";
	}

}
