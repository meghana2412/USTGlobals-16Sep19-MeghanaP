package com.ustglobals.empapp;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

 import com.ustglobals.empapp.dao.EmployeeDAO;
 import com.ustglobals.empapp.dao.EmployeeDAOImpl;
 import com.ustglobals.empapp.dto.EmployeeBean;
 import com.ustglobals.empapp.util.EmployeeManager;


 public class App {

	 public static void main(String[] args) {
		 while (true){
			 System.out.println("Press 1 to get all the Employee details");
			 System.out.println("Press 2 to insert all the Employee details");
			 System.out.println("Press 3 to update all the Employee details");
			 System.out.println("Press 4 to delete all the Employee details");
			 System.out.println("Press 5 to search single  Employee details");

			 Scanner scn = new Scanner(System.in);
			 int ch = scn.nextInt();

			 switch (ch)
			 {
			 case 1:
				 EmployeeDAO dao =  EmployeeManager.getEmployeeDAO();
				 List<EmployeeBean> result  = dao.getAllemployeeData();

				 for (EmployeeBean bean : result)
				 {
					 System.out.println("id : "+bean.getId());
					 System.out.println("name : "+bean.getName());
					 System.out.println("salary : "+bean.getSalary());
					 System.out.println("gender : "+bean.getGender());
					 System.out.println("");
				 }
				 break;
			 case 2:
				 EmployeeDAO dao2 =  EmployeeManager.getEmployeeDAO();


				 EmployeeBean bean2  = new EmployeeBean();
				 int result2 = dao2.insertEmployeeData(bean2);

				 System.out.println(" row(s) inserted : "+result2);
				 break;
			 case 3:
				 
				 EmployeeDAO dao3 =  EmployeeManager.getEmployeeDAO();


				 EmployeeBean bean3  = new EmployeeBean();
				 int result3 = dao3.updateEmployeeData(bean3);

				 System.out.println(" row(s) updated : "+result3);

				 break;
			 case 4:
				 
				 EmployeeDAO dao4 =  EmployeeManager.getEmployeeDAO();
				 System.out.println("Enter id");
                 int id4 = scn.nextInt();
				 int result4 = dao4.deleteEmployeeData(id4);

				 System.out.println(" row(s) deleted : "+result4);
				 break;

			 case 5:
				 EmployeeDAO dao5 =  EmployeeManager.getEmployeeDAO();

				 System.out.println("enter the id to be searched");

				 int id = scn.nextInt();

				 EmployeeBean bean5 = dao5.searchEmployeeData(id);


				 if(bean5 != null)
				 {
					 System.out.println("id : "+bean5.getId());
					 System.out.println("name : "+bean5.getName());
					 System.out.println("salary : "+bean5.getSalary());
					 System.out.println("gender : "+bean5.getGender());
					 System.out.println("");
					 
				 }
				 else
				 {
					 System.out.println("no data found");
				 }

				 break;
			 }

		 }
	 }
 }
