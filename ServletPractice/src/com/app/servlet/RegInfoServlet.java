package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegInfoServlet
 */
public class RegInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		StringBuffer url = request.getRequestURL();
		String uri = request.getRequestURI();
		String st = request.getQueryString();
		String proName = request.getContextPath();
		
		out.println("URL is "+url.toString());
		out.println("URI is: "+uri);
		out.println("Query String is "+st);
		out.println("Context path "+proName);
	}

}
