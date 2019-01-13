package com.app.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormReadServlet
 */
public class FormReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormReadServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data
		String ename = request.getParameter("ename");
		String email = request.getParameter("email");
		String course = request.getParameter("course");
		String gender = request.getParameter("gender");
		String addr = request.getParameter("addr");

		//convert array data to array type
		List<String> languages = Arrays.asList("lang");

		//display data
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>Your data</h2>");
		out.println("<table border = 1></tr>");
		out.println("<td>Name</td><td>"+ename+"</td>");
		out.println("</tr><tr>");

		out.println("<td>Email</td><td>"+email+"</td>");
		out.println("</tr><tr>");

		out.println("<td>Course</td><td>"+course+"</td>");
		out.println("</tr><tr>");

		out.println("<td>Gender</td><td>"+gender+"</td>");
		out.println("</tr><tr>");

		out.println("<td>Address</td><td>"+addr+"</td>");
		out.println("</tr><tr>");

		out.println("<td>Languages</td><td>"+languages+"</td>");
		out.println("</tr></table></body></html>");
	}

}
