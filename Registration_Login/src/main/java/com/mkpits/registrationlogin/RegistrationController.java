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
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistrationController() {
        super();
        System.out.println("Hi 1");
    }
    
    private RegistrationDbUtility dbUtility;
    @Resource(name = "jdbc/login_register")
    private DataSource dataSource;
    
    @Override
    	public void init() throws ServletException {
    		super.init();
    		try {
    			dbUtility=new RegistrationDbUtility(dataSource);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
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
		
		System.out.println(name);
		System.out.println(uname);
		System.out.println(mob);
		System.out.println(email);
		System.out.println(city);
	}

}
