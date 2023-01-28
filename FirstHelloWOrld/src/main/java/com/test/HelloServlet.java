package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html"); //MIME
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Welcome " + name);
		System.out.println("Hello from doPost method");
		response.getWriter().append("Welcome: " + name + " password " + password).append(request.getContextPath());
		out.println("<h1>"+name+"</h1>");
		out.println("<h6>"+name+"</h6>");
		int sum = 12+900;
		out.println("<h6> Hi Sandeep from hello servlet</h6>");
		
//		response.sendRedirect("WelcomeServlet"); // just like href and support only doGet
		
		RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
		rd.include(request, response);
//		rd.forward(request, response);

		out.println("<h6> end from hello servlet</h6>");
	}

}
