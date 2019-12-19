package com.ustglobals.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobals.librarymanagementsystem.dto.LibraryResponse;
import com.ustglobals.librarymanagementsystem.dto.UserBean;
import com.ustglobals.librarymanagementsystem.service.UserService;
@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping(path="/user-login/{userID}/{userPassword}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse userLogin(@PathVariable("userID") int userID,
			@PathVariable("userPassword") String userPassword) {
		
		LibraryResponse response = new LibraryResponse();
		UserBean bean = service.userLogin(userID, userPassword);
		if(bean!=null)
		{
			response.setUser(bean);
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription(" user with id "+userID+" logined successfully");
		}
		else
		{

			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription(" user got failed to login");

		}
		return response;
		
	}
	
	@PostMapping(path ="/regester-user",consumes =MediaType.APPLICATION_JSON_VALUE,
			produces =MediaType.APPLICATION_JSON_VALUE)
	public  LibraryResponse regesterUser(@RequestBody UserBean bean)
	{
		LibraryResponse response = new LibraryResponse();
		if(service.regesterUser(bean))
		{	
			response.setUser(bean);
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("User registered to library");
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User  not registered to the library");
		}
		return response;
	}
	
}
