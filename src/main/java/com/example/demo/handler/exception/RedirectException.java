package com.example.demo.handler.exception;

import org.springframework.http.HttpStatus;

public class RedirectException extends RuntimeException{
	
	private HttpStatus status;
	
	public RedirectException(String message, HttpStatus status) {
		super(message);
		this.status=status;
	}

}
