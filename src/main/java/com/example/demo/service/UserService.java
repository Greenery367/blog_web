package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.SignUpDTO;
import com.example.demo.repository.interfaces.UserRepository;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	@Autowired
	private final UserRepository userRepository;
	
	
	private void createUser(SignUpDTO dto) {
		int result=0;
		
		userRepository.
	}


	private String[] uploadFile(MultipartFile proIcon) {


		if(proIcon.getSize()>1024 * 1024 * 20) {
			throw new Exception("파일 크기는 20MB보다 클 수 없습니다.",HttpSession.class());
		}
		
		return null;
	}
	

}
