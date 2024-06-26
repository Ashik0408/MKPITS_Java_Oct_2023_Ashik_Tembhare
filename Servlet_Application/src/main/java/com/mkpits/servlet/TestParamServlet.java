package com.mkpits.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParamServlet
 */
@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set content type
		response.setContentType("text/html");
		
		//get writer
		PrintWriter out=response.getWriter();
		
		//read configuration param(Parameaters)
		ServletContext context=getServletContext();
		String maxCartSize=context.getInitParameter("max-shopping-cart-size");
		String teamName=context.getInitParameter("project-team-name");
		
		// html contents
		out.println("<html><body>");
		out.println("Max Cart Size :"+maxCartSize);
		out.println("<hr>");
		out.println("Team Name :"+teamName);
		out.println("</body></html>");
	}

}
