package com.ustglobals.librarymanagementsystem.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobals.librarymanagementsystem.dto.BookBean;
import com.ustglobals.librarymanagementsystem.dto.BookRegestrationBean;
import com.ustglobals.librarymanagementsystem.dto.LibraryResponse;
import com.ustglobals.librarymanagementsystem.service.StudentService;
@CrossOrigin(origins = "*",allowedHeaders = "*", allowCredentials = "true")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	
	@GetMapping(path="/get-allBooks",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllBooks()
	{
		LibraryResponse response = new LibraryResponse();
		List<BookBean> beans = service.getAllBooks();
		if(!beans.isEmpty())
		{
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription(" Here are the List of Book");
			response.setBookBean(beans);
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("No Books  found in the library");
		}
		return response;	
	}
	
	@GetMapping(path="/get-book/{bookTitle}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse searchBook(@PathVariable("bookTitle")String bookTitle)
	{

		LibraryResponse response = new LibraryResponse();
		BookBean bean = service.searchBook(bookTitle);
		if(bean!=null)
		{
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription(bookTitle+ " found in the library");
			response.setBookBean(Arrays.asList(bean));
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription(bookTitle+" not found in the library");
		}
		return response;
	}
	
	
	@GetMapping(path="/request-book/{userID}/{bookId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestBook( @PathVariable ( "userID") int userID,
										@PathVariable ( "bookId") int bookId)
	{
		LibraryResponse response = new LibraryResponse();
		BookRegestrationBean bean = new BookRegestrationBean();
		bean.setBookId(bookId);
		bean.setUserID(userID);
		LocalDate todaysDate =LocalDate.now();
		bean.setRegestrationDate(todaysDate);
		boolean request = service.requestBook(bean);
		if(request!=false)
		{
			response.setRegesterBean(bean);
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription( " request for ur book with book id "+bookId+" is successfull");
		
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription(" you have failed to request the book");
		}
		return response ;
	}

	@DeleteMapping(path="/cancel-request/{regestrationId}/{userID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean cancelRequest(@PathVariable("regestrationId") int regestrationId,
								@PathVariable("userID")int userID)
	{
		return service.cancelRequest( regestrationId,userID);
	

	}

}
