package com.example.demo.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.SignUpDTO;
import com.example.demo.repository.model.User;


@Mapper
public interface UserRepository {
	
	public int createUser(SignUpDTO dto); 
	public int updateById(User user);
	public int deleteById(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
}
