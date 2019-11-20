package com.ustglobals.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try 
		{
			//Step 1 load Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//Step 2 get the connection

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue SQL Query
			String sql  =" insert into employee_info "+" values(8,'manjula',234567,'f')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//Step 4 Read and Result
			System.out.println(count+ " Row(s) inserted");
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
				if(stmt!=null)
				{
					stmt.close();
				}

			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

	}//end of main
}//end of ExecuteInsertQuery
