package com.ustglobals.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateWithTryResources {

	public static void main(String[] args) {

		try(FileReader reader = new FileReader("db.properties"))
		{
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("update-query");

			try(Connection conn = DriverManager.getConnection(url,prop))
			{
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
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
				System.out.println(count1 +"  row updated with resources ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
