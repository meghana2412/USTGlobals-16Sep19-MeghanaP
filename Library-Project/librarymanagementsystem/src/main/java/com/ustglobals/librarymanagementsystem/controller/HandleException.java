package com.ustglobals.librarymanagementsystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ustglobals.librarymanagementsystem.dto.LibraryResponse;

public class HandleException {

	@ExceptionHandler(Exception.class)
	public  LibraryResponse getException()
	{
		LibraryResponse response = new LibraryResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}
}
