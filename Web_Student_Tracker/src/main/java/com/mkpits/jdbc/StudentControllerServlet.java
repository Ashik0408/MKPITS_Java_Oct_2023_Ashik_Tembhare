package com.mkpits.jdbc;

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
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private StudentDbUtil studentDbUtil;
    @Resource(name = "jdbc/web_student_tracker")
    private DataSource dataSource;
    
    @Override
    public void init() throws ServletException {
    	// create our db util ... and pass in the conn pool / datasource
    	
    	try {
			studentDbUtil =new StudentDbUtil(dataSource);
		} catch (Exception e) {
			throw new ServletException(e);
		}
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		{
			listStudents(request,response);
		} 
		catch (Exception e) {
			throw new ServletException(e);
			
		}
	}


	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get student from db
		List<Student> students=studentDbUtil.getStudents();
		
		// add student to request
		request.setAttribute("STUDENT_LIST", students);
		
		// send to jsp page (view)
		RequestDispatcher dispatcher=request.getRequestDispatcher("/student_list.jsp");
		dispatcher.forward(request, response);
	}

	
}
