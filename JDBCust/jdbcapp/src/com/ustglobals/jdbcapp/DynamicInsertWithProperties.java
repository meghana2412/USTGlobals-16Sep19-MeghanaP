package com.ustglobals.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class DynamicInsertWithProperties {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;

		try 
		{
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//Step 1 load Driver
			Class.forName(prop.getProperty("driver-class-name"));

			//Step 2 get the connection

			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			//Step 3 Issue SQL Query
			String sql  =prop.getProperty("insert-query");
			
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
		catch(Exception e)
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
				if(reader!=null)
				{
					reader.close();
				}

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}//end of main

}
