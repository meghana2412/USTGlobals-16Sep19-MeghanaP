package com.ustglobals.empapp.dao;

import java.util.List;

import com.ustglobals.empapp.dto.EmployeeBean;

public interface EmployeeDAO {

	public List<EmployeeBean> getAllemployeeData();
	public EmployeeBean searchEmployeeData (int id);
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);

}
