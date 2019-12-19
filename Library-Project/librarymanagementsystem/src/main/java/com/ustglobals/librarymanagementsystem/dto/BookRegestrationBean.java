package com.ustglobals.librarymanagementsystem.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Book_Regestration")
public class BookRegestrationBean {
	
	@Id
	@Column
	@GeneratedValue
	private int regestrationId;
	@Column
	private int bookId;
	@Column
	private int userID;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate regestrationDate;
	
	public int getRegestrationId() {
		return regestrationId;
	}
	public void setRegestrationId(int regestrationId) {
		this.regestrationId = regestrationId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public LocalDate getRegestrationDate() {
		return regestrationDate;
	}
	public void setRegestrationDate(LocalDate regestrationDate) {
		this.regestrationDate = regestrationDate;
	}
	
	
}
