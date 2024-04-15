package com.mkpits.jdbc1;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServletNew")
public class StudentControllerServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	private StudentDbUtility studentDbUtil;

	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {

		super.init();
		// create our student db util ... and pass in the conn pool / datasource
		try {
			studentDbUtil = new StudentDbUtility(dataSource);
		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			// readthe command parameater
			String theCommand = request.getParameter("command");

			// if the command is missing default to listing student

			if (theCommand == null) {
				theCommand = "LIST";
			}

			// route to the appropriate method

			switch (theCommand) {
			case "LIST":
				listStudents(request, response);
				break;

			case "ADD":
				addStudent(request, response);
				break;
			case "LOAD":
				loadStudent(request, response);
				break;
			case "UPDATE":
				updateStudent(request, response);
				break;
			case "DELETE":
				deleteStudent(request, response);
				break;
			default:
				listStudents(request, response);
				break;
			}
			listStudents(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String studentId = request.getParameter("studentId");

		// delete student from database
		studentDbUtil.deleteStudent(studentId);

		// send back to again "list-student.jsp"
		listStudents(request, response);

	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student id from form data
		String studentId = request.getParameter("studentId");
		int id = Integer.parseInt(studentId);

		// read student data from form
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		// create a new student object
		Student_Model theStudent = new Student_Model(id, firstName, lastName, email);

		// perform update on deatabase
		studentDbUtil.updatStudent(theStudent);

		// send them back to the list "list-students" page
		listStudents(request, response);

	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read student id from form data
		String theStudentId = request.getParameter("studentId");

		// get student from database (dbutility)
		Student_Model theStudent = studentDbUtil.loadStudents(theStudentId);

		// place student in the request attribute
		request.setAttribute("THE_STUDENT", theStudent);

		// send to JSP page view
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-list-student-form.jsp");
		dispatcher.forward(request, response);

	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student data from form
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		// create new student_Model object
		Student_Model theStudent = new Student_Model(firstName, lastName, email);

		// add student to the database
		studentDbUtil.addStudent(theStudent);

		// send back to the main page
		listStudents(request, response);

	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// get students from db util
		List<Student_Model> students = studentDbUtil.getStudents();

		// add students to the request
		request.setAttribute("STUDENT_LIST", students);

		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student-button.jsp");
		dispatcher.forward(request, response);
	}

}
