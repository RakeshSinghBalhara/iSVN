package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Hello World";
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		String name = request.getParameter("username");
		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1> welcome servlet " + name + "</h1>");
		out.println("<h6> end from WelcomeServlet servlet</h6>");
	}
}
