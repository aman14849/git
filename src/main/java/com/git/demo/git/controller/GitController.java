package com.git.demo.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("git")
public class GitController {

	@GetMapping("/status")
	public String checkApplicatoin() {
		return "running!";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "aman";
	}
	
	
	
	
}
