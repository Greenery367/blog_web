package com.example.demo.dto;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.repository.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDTO {
	private String username;
	private String password;
	private String nickname;
	private MultipartFile proIcon;
	
	
	public User toUser() {
		User mewUser = User.builder()
				.username(username)
				.password(password)
				.nickname(nickname)
				.build();
		return null;
	}
}
