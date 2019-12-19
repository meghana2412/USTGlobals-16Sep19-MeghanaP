package com.ustglobals.librarymanagementsystem.dao;

import java.util.List;

import com.ustglobals.librarymanagementsystem.dto.BookBean;
import com.ustglobals.librarymanagementsystem.dto.BookRegestrationBean;

public interface StudentDAO {

	public BookBean searchBook(String bookTitle);
	public boolean requestBook( BookRegestrationBean bean);
	public boolean cancelRequest(int regestrationId,int userID);
    public List<BookBean> getAllBooks();
    }
