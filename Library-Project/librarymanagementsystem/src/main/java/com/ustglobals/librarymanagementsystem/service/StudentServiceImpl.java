package com.ustglobals.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobals.librarymanagementsystem.dao.StudentDAO;
import com.ustglobals.librarymanagementsystem.dto.BookBean;
import com.ustglobals.librarymanagementsystem.dto.BookRegestrationBean;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO dao;

	

	@Override
	public BookBean searchBook(String bookTitle) {
		return dao.searchBook(bookTitle);
	}

	@Override
	public boolean requestBook(BookRegestrationBean bean) {
		return dao.requestBook(bean);
	}

	@Override
	public boolean cancelRequest(int regestrationId, int userID) {
		return dao.cancelRequest(regestrationId, userID);
	}

	@Override
	public List<BookBean> getAllBooks() {
		return dao.getAllBooks();
	}

	
}
