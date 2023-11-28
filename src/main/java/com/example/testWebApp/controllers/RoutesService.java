package com.example.testWebApp.controllers;

import org.springframework.stereotype.Service;

@Service
public class RoutesService {
	
	public String showHome() {
		return "index";
	}
	
}
