package com.mkpits.registrationlogin;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	private RegistrationDbUtility regUtility;

	@Resource(name = "jdbc/login_register")
	private DataSource dataSource;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			regUtility = new RegistrationDbUtility(dataSource);
		} catch (Exception exc) {
			throw new ServletException(exc);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			register(request, response);
			System.out.println("Data Yeun RAyla");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String uname = request.getParameter("uname");
		long mob = Long.parseLong((request.getParameter("mob")));
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String gen = request.getParameter("gen");
		String pass = request.getParameter("pass");

		Registration registration = new Registration(name, uname, mob, email, city, gen, pass);
		regUtility.registerData(registration);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
		System.out.println("Data Yeun RAyla");
		
	}

}
