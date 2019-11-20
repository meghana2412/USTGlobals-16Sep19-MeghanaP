package com.ustglobals.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {

	public static void main(String[] args) {

		try(FileReader reader = new FileReader("db.properties"))
		{
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("select-query");

			try(Connection conn = DriverManager.getConnection(url,prop))
			{
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);

				while(rs.next())
				{
					System.out.println("id : "+rs.getInt("id"));
					System.out.println("name : "+rs.getString("name"));
					System.out.println("salary : "+rs.getInt("salary"));
					System.out.println("gender: "+rs.getString("gender"));
					System.out.println("");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
