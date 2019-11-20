package com.ustglobals.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class DynamicDeleteWithProperties {

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
			
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			
//			String empid = ;
//			int id = 
			pstmt.setInt(1,Integer.parseInt(args[0]));
			
			int count2 = pstmt.executeUpdate();
			
			System.out.println(count2 + " row(s)  dynamically deleted ");
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
