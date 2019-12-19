package com.ustglobals.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobals.librarymanagementsystem.dao.LibrarianDAO;
import com.ustglobals.librarymanagementsystem.dto.BookBean;
import com.ustglobals.librarymanagementsystem.dto.BookRegestrationBean;
import com.ustglobals.librarymanagementsystem.dto.IssueBookDetailsBean;

@Service
public class LibrarianServiceImpl implements LibrarianService{
	
	@Autowired
	private LibrarianDAO dao;

	@Override
	public boolean addBooks(BookBean bean) {
		return dao.addBooks(bean);
	}

	@Override
	public boolean updateBooks(BookBean bean) {
		return dao.updateBooks(bean);
	}

	@Override
	public boolean deleteBooks(int bookId) {
		return dao.deleteBooks(bookId);
	}

	

	@Override
	public List<IssueBookDetailsBean> showAllIssuedBooks() {
		return dao.showAllIssuedBooks();
	}

	

	@Override
	public List<BookBean> searchBook() {
		return dao.searchBook();
	}

	@Override
	public List<BookRegestrationBean> showAllRequests() {
		return dao.showAllRequests();
	}

	@Override
	public boolean acceptRequest(int regestrationId) {
		return dao.acceptRequest(regestrationId);
	}

	@Override
	public boolean issueBook(int userID, int bookId) {
		return dao.issueBook(userID, bookId);
	}

	
}
