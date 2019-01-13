package com.app.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyDataServlet
 */
public class MyDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//reading query parameters
		String sid = request.getParameter("sid");
		int id = Integer.parseInt(sid);
		
		String sname = request.getParameter("sname");
		String sfee = request.getParameter("sfee");
		
		//output data
		PrintWriter out = response.getWriter();
		out.println("Id is: "+id);
		out.println("/");
		out.println("Name is: "+sname);
		out.print("/");
		out.println("Fee is: "+sfee);
	}

}
