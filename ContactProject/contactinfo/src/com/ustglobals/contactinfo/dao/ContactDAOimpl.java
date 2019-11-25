package com.ustglobals.contactinfo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobals.contactinfo.dto.ContactsBean;

public class ContactDAOimpl implements ContactInfo {

	private static final  String URL = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
	private static final String Driver_NAME = "com.mysql.jdbc.Driver";
	private static final String SELECT_SQL = "select * from contact";
	private static final String SELECT_NAME_SQL = "select * from contact where name =?";
	private static final String ADD_SQL = "insert into contact values (?,?,?)";
	private static final String EDIT_SQL = "update contact  set number =?,group_name=? where name=?";
	private static final String DELETE_SQL = "delete from contact where name=?";

	/****************** Show all contact *******************/
	@Override
	public List<ContactsBean> getAllContactData() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(Driver_NAME);
			conn = DriverManager.getConnection(URL);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_SQL);
			List<ContactsBean> contacts = new ArrayList<ContactsBean>();
			while(rs.next()) {
				ContactsBean bean =  new ContactsBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getLong("number"));
				bean.setGroupName(rs.getString("groupName"));
				contacts.add(bean);

			}
			return contacts;

		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/********************* Search Contact ***************/
	@Override
	public ContactsBean searchContact(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName(Driver_NAME);
			conn = DriverManager.getConnection(URL);
			pstmt = conn.prepareStatement(SELECT_NAME_SQL);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			ContactsBean bean1 =  new ContactsBean();
			if(rs.next()) {

				bean1.setName(rs.getString("name"));
				bean1.setNumber(rs.getLong("number"));
				bean1.setGroupName(rs.getString("groupName"));


			}
			return bean1;

		}catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public int addContact(ContactsBean bean) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(Driver_NAME);
			conn = DriverManager.getConnection(URL);
			pstmt = conn.prepareStatement(ADD_SQL);

			pstmt.setString(1, bean.getName());
			pstmt.setLong(2, bean.getNumber());
			pstmt.setString(3, bean.getGroupName());

			int result = pstmt.executeUpdate();

			return result;

		}catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int deleteContact(ContactsBean bean) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(Driver_NAME);
			conn = DriverManager.getConnection(URL);
			pstmt = conn.prepareStatement(DELETE_SQL);
			pstmt.setString(1, bean.getName());

			int result = pstmt.executeUpdate();

			return result;

		}catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	/**************EDIT*************/
	@Override
	public int editContact(ContactsBean bean) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(Driver_NAME);
			conn = DriverManager.getConnection(URL);
			pstmt = conn.prepareStatement(EDIT_SQL);
			pstmt.setString(3, bean.getName());
			pstmt.setLong(1, bean.getNumber());
			pstmt.setString(2, bean.getGroupName());
			int result = pstmt.executeUpdate();

			return result;

		}catch (Exception e) {
			e.printStackTrace();
		}	finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
}

