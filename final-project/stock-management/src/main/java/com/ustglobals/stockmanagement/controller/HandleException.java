package com.ustglobals.stockmanagement.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobals.stockmanagement.dto.ProductResponse;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public  ProductResponse getException()
	{
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}
}

