package com.ladp.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeResourses {

	
	
	
	@GetMapping("/")
	public String home (){
		return "home page";
	}

	
}
