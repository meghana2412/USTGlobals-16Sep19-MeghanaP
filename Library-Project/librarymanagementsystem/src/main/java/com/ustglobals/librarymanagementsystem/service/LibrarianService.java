package com.ustglobals.librarymanagementsystem.service;

import java.util.List;

import com.ustglobals.librarymanagementsystem.dto.BookBean;
import com.ustglobals.librarymanagementsystem.dto.BookRegestrationBean;
import com.ustglobals.librarymanagementsystem.dto.IssueBookDetailsBean;

public interface LibrarianService {
	
	public boolean addBooks(BookBean bean);
	public boolean updateBooks(BookBean bean);
	public boolean deleteBooks(int bookId);
	public List<BookBean> searchBook();
	public boolean issueBook(int userID ,int bookId);
	public List<IssueBookDetailsBean> showAllIssuedBooks();
	public List<BookRegestrationBean> showAllRequests();
	public boolean acceptRequest(int regestrationId);
}
