package com.ustglobals.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			
			//Step 1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?";
			conn = DriverManager.getConnection(url,"root","root");
			
			//Step 3 Issue SQL query
			stmt = conn.createStatement();
			String sql = "select * from employee_info ";
			rs = stmt.executeQuery(sql);
			
			//Step 4 Read the Result
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("salary");
				String gender = rs.getString("gender");
				
				System.out.println("id is : "+id);
				System.out.println("name is : "+name);
				System.out.println("salary is : "+sal);
				System.out.println("gender is : "+gender);
				System.out.println("***************************");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
		  // Step 5 close all the JDBC objects		

			try
			{
				if(conn!=null)
				{
					conn.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}


	}
}
