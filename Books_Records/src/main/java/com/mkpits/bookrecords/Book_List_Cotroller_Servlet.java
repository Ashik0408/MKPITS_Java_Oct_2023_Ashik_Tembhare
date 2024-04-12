package com.mkpits.bookrecords;

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
 * Servlet implementation class Book_List_Cotroller_Servlet
 */
@WebServlet("/Book_List_Cotroller_Servlet")
public class Book_List_Cotroller_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Books_Db_Utility utility;
	
	// add resources 
	@Resource(name = "jdbc/web_book")
	private DataSource source;
	
	// invoke init method
	@Override
	public void init() throws ServletException {
		super.init();
		try {
			utility=new Books_Db_Utility(source);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			listBook(request,response);
		} 
		catch (Exception e) {
			throw new ServletException(e);
			
		}
	}


	private void listBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				// get books from db
				List<Book_Model> book=utility.getBooks();
				
				// add student to request
				request.setAttribute("Books_List", book);
				
				// send to jsp page (view)
				RequestDispatcher dispatcher=request.getRequestDispatcher("/books_list.jsp");
				dispatcher.forward(request, response);
		
	}

}
