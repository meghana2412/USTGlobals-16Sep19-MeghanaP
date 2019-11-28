package com.ustglobals.jpacurd.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class UpdateStmt {


	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);

			String sql = "update employee_info set name='MANJULA',salary=234567, gender='f' where id =7";
			stmt = conn.createStatement();
			int count1 = stmt.executeUpdate(sql);

			System.out.println(count1 + "  Row(s) updated");
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
	}
}


