package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	HttpSession session; 
	
	public MainController(HttpSession session) {
		this.session=session;
	}
	
	@GetMapping({"/main-page","/index"})
	public String mainPage() {
		if(session==null) {
			return "view/signin";
		}
		
		
		return "main";
	}

	@GetMapping("/sign-in")
	public String signinPage() {
		return "user/signin";
	}
	
	@GetMapping("/sign-up")
	public String signupPage() {
		return "user/signup";
	}
	
}
