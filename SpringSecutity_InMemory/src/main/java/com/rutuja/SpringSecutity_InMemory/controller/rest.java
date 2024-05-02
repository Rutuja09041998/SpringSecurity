package com.rutuja.SpringSecutity_InMemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rutuja")
public class rest {

	@GetMapping("/public")
	public String publicUser() {
		return "I am public user.";
	}
	
	@GetMapping("/admin")
	public String adminUser() {
		return "I am admin user.";
	}
	
	
	@GetMapping("/user")
	public String user() {
		return "I am normal user.";
	}
}
