package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutServlet
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		
		if (session == null) {
			out.print("<h1>You session has already expired</h1>");
//			request.getRequestDispatcher("index.html").include(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		} else {
			String attribute = (String) session.getAttribute("sessionId");
			out.print("<h1>Going to expire your session " + attribute + "</h1>");
			session.invalidate();
			out.print("<a href=LogoutServlet>Logout</a>");
			request.getRequestDispatcher("home.html").include(request, response);
		}
	}

}
