package com.ustglobals.jpacurd.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class InsertPrepare {


	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try 
		{
			//Step 1 load Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2 get the connection

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue SQL Query
			String sql  =" insert into employee_info  values(?, ? , ? , ?)";

			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1,id);

			String name = args[1];
			pstmt.setString(2,name);

			String empsalary = args[2];
			int salary = Integer.parseInt(empsalary);
			pstmt.setInt(3,salary);

			String gender = args[3];
			pstmt.setString(4,gender);


			int count = pstmt.executeUpdate();

			//Step 4 Read and Result
			System.out.println(count+ " Row(s) prepared");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}

			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}//end of main
}//end of ExecuteInsertQuery



