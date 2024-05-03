package com.ashik.register;

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
 * Servlet implementation class MyRegisterController
 */
@WebServlet("/MyRegisterController")
public class MyRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	private RegisterUtility registerUtility;
	
	@Resource(name ="jdbc/registration")
	private DataSource dataSource;
	
	
	public MyRegisterController() {
		super();
	}


	public void init() throws ServletException {
		try {
		registerUtility = new RegisterUtility(dataSource);
		}catch(Exception e) {
			throw new ServletException(e);
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			insertData(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void insertData(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String mob_no = request.getParameter("mob_no");
		String city = request.getParameter("city");
		String password = request.getParameter("password");
		
		RegisterModel model = new RegisterModel(id, name, username, email, mob_no, city, password);
		
		registerUtility.insertData(model);
		
		System.out.println("Data inserted");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/homepage.html");
		dispatcher.forward(request, response);
		
		
	}

}
