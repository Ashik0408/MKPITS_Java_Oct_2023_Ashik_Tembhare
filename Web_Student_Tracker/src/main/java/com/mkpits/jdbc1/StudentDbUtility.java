package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtility {

	private DataSource dataSource;

	public StudentDbUtility(DataSource dataSource) {

		this.dataSource = dataSource;
	}

	public List<Student_Model> getStudents() throws Exception {
		List<Student_Model> students = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			myConn = dataSource.getConnection();

			// create a sql statement
			String sql = "select * from student order by id";
			myStmt = myConn.createStatement();

			// execute sql query
			myRs = myStmt.executeQuery(sql);

			// process the result set
			while (myRs.next()) {

				// retrive data from result set
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// create new Student Object
				Student_Model tempStudent = new Student_Model(id, firstName, lastName, email);

				// add it to the list of student
				students.add(tempStudent);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRs);
		}
		return students;
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
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

	public void addStudent(Student_Model theStudent) {

		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create sql for insert
			String sql = "insert into student(first_name,last_name,email) values(?,?,?)";
			myStmt = myConn.prepareStatement(sql);

			// set the parameater into table student
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());

			// execute sql insert
			myStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}

	}

	public Student_Model loadStudent(String theStudentId) {
		Student_Model theStudent = null;
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int studentId;

		try {
			// convert student id into integer
			studentId = Integer.parseInt(theStudentId);

			// get database connection
			myConn = dataSource.getConnection();

			// create sql to get selected student
			String sql = "select * from student where id = ?";

			// create a prepared statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setInt(1, studentId);

			// execute statement
			myRs = myStmt.executeQuery();

			// retrive data from result set row
			if (myRs.next()) {
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// use the studentid during constrction
				theStudent = new Student_Model(studentId, firstName, lastName, email);
			} else {
				throw new Exception("Could not find studentid " + studentId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, myRs);
		}

		return theStudent;
	}

	public Student_Model loadStudents(String theStudentId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
