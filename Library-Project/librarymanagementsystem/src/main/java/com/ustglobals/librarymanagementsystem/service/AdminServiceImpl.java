package com.ustglobals.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobals.librarymanagementsystem.dao.AdminDAO;
import com.ustglobals.librarymanagementsystem.dto.UserBean;
@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO dao;
	
	@Override
	public boolean updateLibrarian(UserBean bean) {
		return dao.updateLibrarian(bean);
	}

	@Override
	public boolean updateStudent(UserBean bean) {
		return dao.updateStudent(bean);
	}

	

	@Override
	public UserBean searchUser(int userID) {
		return dao.searchUser(userID);
	}

	
	@Override
	public boolean deleteUser(int userID) {
		return dao.deleteUser(userID);
	}

	@Override
	public List<UserBean> showAllUsers() {
		return dao.showAllUsers();
	}

	

}
