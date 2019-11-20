package com.ustglobals.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class ExecuteUpdateFileWithProperties {

public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try
		{
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			String sql = prop.getProperty("update-query");
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int salary = Integer.parseInt(empsal);
			
			String gender = args[3];
			
			pstmt.setString(1,name);
			pstmt.setInt(2,salary);
			pstmt.setString(3,gender);
			pstmt.setInt(4,id);

			int count1 = pstmt.executeUpdate();
			
			System.out.println(count1 + "  Row(s)  updated with properties");
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
	}
}
