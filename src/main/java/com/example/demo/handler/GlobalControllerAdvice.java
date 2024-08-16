package com.example.demo.handler;

import com.example.demo.handler.exception.DataDeliveryException;

public class GlobalControllerAdvice {
	
	public String dataDeleveryException(DataDeliveryException e) {
		StringBuffer sb = new StringBuffer();
		sb.append(" <script>");
		sb.append(" alert('"+ e.getMessage()  +"');");
		sb.append(" window.history.back();");
		sb.append(" </script>");
		return sb.toString(); 
	}

}
