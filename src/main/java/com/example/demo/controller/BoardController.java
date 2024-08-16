package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/board")
@Controller
public class BoardController {

	HttpSession session; 
	
	public BoardController(HttpSession session) {
		this.session=session;
	}
	
	@GetMapping({"/index"})
	public String mainPage() {
//		if(session==null) {
//			return "view/signin";
//		}
		return "main";
	}
	
	@GetMapping({"/detail"})
	public String detailPage() {
//		if(session==null) {
//			return "view/signin";
//		}
		return "detailPage";
	}
	
}
