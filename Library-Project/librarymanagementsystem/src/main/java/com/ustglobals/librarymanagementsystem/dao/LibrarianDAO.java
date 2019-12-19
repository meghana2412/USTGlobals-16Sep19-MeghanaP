package com.ustglobals.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobals.librarymanagementsystem.dto.BookBean;
import com.ustglobals.librarymanagementsystem.dto.BookRegestrationBean;
import com.ustglobals.librarymanagementsystem.dto.IssueBookDetailsBean;

public interface LibrarianDAO {
	
	public boolean addBooks(BookBean bean);
	public boolean updateBooks(BookBean bean);
	public boolean deleteBooks(int bookId);
	public List<BookBean> searchBook();
	public boolean issueBook(int userID ,int bookId);
	public List<IssueBookDetailsBean> showAllIssuedBooks();
	public List<BookRegestrationBean> showAllRequests();
	public boolean acceptRequest(int regestrationId);
}
