package com.ustglobal.empwebapp.util;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dao.EmployeeDAOJDBCImpl;

public class EmployeeDAOManger {

	private EmployeeDAOManger() {}

	public static EmployeeDAO getEmployeeDAO() {

		return new EmployeeDAOJDBCImpl();
	}
}
