package com.ustglobals.empapp.util;

import com.ustglobals.empapp.dao.EmployeeDAO;
import com.ustglobals.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {
	
	private EmployeeManager()
	{
		
	}

	public static EmployeeDAO getEmployeeDAO()
	{
		return new EmployeeDAOImpl();
	}
}
