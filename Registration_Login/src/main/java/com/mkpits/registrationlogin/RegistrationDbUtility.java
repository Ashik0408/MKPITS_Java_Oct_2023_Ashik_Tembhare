package com.mkpits.registrationlogin;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class RegistrationDbUtility {

	private DataSource dataSource;

	public RegistrationDbUtility(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void registerData(Registration registration) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		try 
		{
			myConn = dataSource.getConnection();
			String sql="insert into registration (name,username,mob_no,email,city,gender,password) values(?,?,?,?,?,?,?)";
			myStmt=myConn.prepareStatement(sql);
			
			myStmt.setString(1,registration.getName());
			myStmt.setString(2,registration.getUsername());
			myStmt.setLong(3,registration.getMob_no());
			myStmt.setString(4,registration.getEmail());
			myStmt.setString(5,registration.getCity());
			myStmt.setString(6,registration.getGender());
			myStmt.setString(7,registration.getPassword());
			
			myStmt.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
	}

	private void close(Connection myConn, PreparedStatement myStmt, Object object) {
		try {
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
