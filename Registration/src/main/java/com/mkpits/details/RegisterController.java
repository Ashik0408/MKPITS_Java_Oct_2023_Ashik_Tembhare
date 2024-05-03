package com.mkpits.details;

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
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 674532190L;

	private RegistrationDbUtil dbUtil;
	
	@Resource(name = "jdbc/registration")
	private DataSource dataSource;
	
	@Override
		public void init() throws ServletException {
			super.init();
			try 
			{
				dbUtil=new RegistrationDbUtil(dataSource);
			} 
			catch (Exception e) 
			{
				throw new ServletException(e);
			}
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		addRegistration(request,response);
	}


	private void addRegistration(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("name");
		String uname= request.getParameter("username");
		String email= request.getParameter("email");
		String mob_no= request.getParameter("mob_no");
		String city= request.getParameter("city");
		String password= request.getParameter("password");
		
		RegistrationModel model=new RegistrationModel(id, name, uname, email, mob_no, city, password);
		dbUtil.addRegisters(model);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/homepage.html");
		dispatcher.forward(request, response);
		
	}

}
