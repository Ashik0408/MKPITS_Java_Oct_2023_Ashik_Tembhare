package com.mkpits.details;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;



public class RegistrationDbUtil 
{

	private DataSource dataSource;
	public RegistrationDbUtil(DataSource dataSource) 
	{
		this.dataSource=dataSource;
	}
	public void addRegisters(RegistrationModel model) 
	{
		Connection conn=null;
		PreparedStatement psmt=null;
		
		try 
		{
			conn=dataSource.getConnection();
			String sql="insert into registration (id,name,username,email,mob_no,city,password) values(?,?,?,?,?,?)";
			psmt=conn.prepareStatement(sql);
			
			psmt.setInt(1,model.getId());
			psmt.setString(2,model.getName());
			psmt.setString(3,model.getUsername());
			psmt.setString(4,model.getEmail());
			psmt.setString(5,model.getMob());
			psmt.setString(6,model.getCity());
			psmt.setString(7,model.getPassword());
			
			psmt.execute();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally {
			close(conn,psmt);
		}
	}
	private void close(Connection conn, PreparedStatement psmt) 
	{
		try {
			if (conn != null) {
				conn.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
