package com.example.testWebApp.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")


public class RoutesTest {
	
	public final RoutesService routesService;
	
	@Autowired  
	public RoutesTest(RoutesService routesService) {
		this.routesService = routesService;
	}
	
	@GetMapping
	public String showHome() {
		return routesService.showHome();
	}
	
}


//auto wired is so you don't have to initialize a specific new object, in this case 'routesService'. 
//must be used with Component which can be found in the RoutesService file. 