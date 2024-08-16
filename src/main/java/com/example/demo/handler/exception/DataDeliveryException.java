package com.example.demo.handler.exception;

import org.springframework.http.HttpStatus;

public class DataDeliveryException extends RuntimeException{

	private HttpStatus status;
	
	public DataDeliveryException(String message, HttpStatus status) {
		super(message);
		this.status=status;
	}
}
