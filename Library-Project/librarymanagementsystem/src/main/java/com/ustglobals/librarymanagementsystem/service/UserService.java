package com.ustglobals.librarymanagementsystem.service;

import com.ustglobals.librarymanagementsystem.dto.UserBean;

public interface UserService {

	public UserBean userLogin(int userID, String userPassword);
	public boolean regesterUser(UserBean bean);

}
