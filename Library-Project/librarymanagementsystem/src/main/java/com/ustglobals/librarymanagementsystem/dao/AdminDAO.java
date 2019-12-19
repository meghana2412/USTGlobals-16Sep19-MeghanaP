package com.ustglobals.librarymanagementsystem.dao;


import java.util.List;


import com.ustglobals.librarymanagementsystem.dto.UserBean;

public interface AdminDAO {
	
	
	public boolean updateLibrarian(UserBean bean); 
	public boolean updateStudent(UserBean bean); 
	public boolean deleteUser(int userID);
	public List<UserBean> showAllUsers(); 	
	public UserBean searchUser(int userID) ;
	
}
