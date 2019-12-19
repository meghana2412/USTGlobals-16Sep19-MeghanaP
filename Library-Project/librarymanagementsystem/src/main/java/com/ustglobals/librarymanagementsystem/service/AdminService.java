package com.ustglobals.librarymanagementsystem.service;

import java.util.List;

import com.ustglobals.librarymanagementsystem.dto.UserBean;

public interface AdminService {

	
	public boolean updateLibrarian(UserBean bean); 
	public boolean updateStudent(UserBean bean); 
	public boolean deleteUser(int userID);
	public List<UserBean> showAllUsers(); 	
	public UserBean searchUser(int userID) ;
}
