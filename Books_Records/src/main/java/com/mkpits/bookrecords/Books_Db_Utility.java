package com.mkpits.bookrecords;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class Books_Db_Utility {

	private DataSource source;

	public Books_Db_Utility(DataSource source) {
		super();
		this.source = source;
	}
	
	public List<Book_Model> getBooks()
	{
		List<Book_Model> list=new ArrayList<>();
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=source.getConnection();
			//create sql query
			String sql="select * from books order by id";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while (rs.next()) {
				int id=rs.getInt("id");
				String firstName=rs.getString("title");
				String lastName=rs.getString("author");
				
				// create book_model obj
				Book_Model bookModel=new Book_Model(id, firstName, lastName);
				
				// adding data to the list
				list.add(bookModel);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(conn,stmt,rs);
		}
		
		return list;
		
	}

	private void close(Connection conn, Statement stmt, ResultSet rs) {
		try 
		{
			if (rs!=null) 
			{
				rs.close();
			}
			if (stmt!=null) 
			{
				stmt.close();
			}
			if (conn!=null) 
			{
				conn.close();
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
