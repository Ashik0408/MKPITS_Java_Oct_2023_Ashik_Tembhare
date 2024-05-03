package com.mkpits.registrationlogin;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ControllerServelet
 */
@WebServlet("/ControllerServelet")
public class ControllerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	RegistrationDbUtility dbUtility;
	@Resource(name = "jdbc/login_register")
	DataSource dataSource;
	public void init(ServletConfig config) throws ServletException {
		super.init();
		try {
			dbUtility=new RegistrationDbUtility(dataSource);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		addUser(request,response);
	}

	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String uname=request.getParameter("uname");
		long mob=Long.parseLong(request.getParameter("mob"));
		String email=request.getParameter("email");
		String city=request.getParameter("city");
		String gen=request.getParameter("gen");
		String pass=request.getParameter("pass");
		
		Registration registration=new Registration(name, uname, mob, email, city, gen, pass);
		dbUtility.registerData(registration);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
		
	}

}
