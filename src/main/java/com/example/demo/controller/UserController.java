package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.SignInDTO;
import com.example.demo.dto.SignUpDTO;
import com.example.demo.repository.model.User;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/user")
@Controller
public class UserController {

	HttpSession session; 
	
	public UserController(HttpSession session) {
		this.session=session;
	}


	/**
	 * 유저 - 로그인 페이지 이동
	 * @return
	 */
	@GetMapping("/sign-in")
	public String signinPage() {
		return "user/signin";
	}
	
	/**
	 * 유저 - 회원가입 페이지 이동
	 * @return
	 */
	@GetMapping("/sign-up")
	public String signupPage() {
		return "user/signup";
	}
	
	@PostMapping("/sign-in")
	public String signInProc(SignInDTO dto) {
		
		
		return "";
	}
	
	@PostMapping("/sign-up")
	public String sigUpProc(SignUpDTO dto) {
	//  유효성 검사
		
		User user=dto.toUser();
		userService.
			
		return "";
	}
	
	
}
