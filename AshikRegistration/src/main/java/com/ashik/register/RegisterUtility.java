package com.ashik.register;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class RegisterUtility {

	private DataSource dataSource;

	public RegisterUtility(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}

	public void insertData(RegisterModel model) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			
			myConn = dataSource.getConnection();
			String sql= "insert into registration(id,name,username,email,mob_no,city,password) values(?,?,?,?,?,?,?)";
			
			myStmt.setInt(1, model.getId());
			myStmt.setString(2, model.getName());
			myStmt.setString(3, model.getUsername());
			myStmt.setString(4, model.getEmail());
			myStmt.setString(5, model.getMob_no());
			myStmt.setString(6, model.getCity());
			myStmt.setString(7, model.getPassword());
			
			myStmt.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	 
	
}
