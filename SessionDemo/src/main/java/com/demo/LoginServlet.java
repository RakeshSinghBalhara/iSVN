package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		if (name.equals("ctidemo") && password.equals("Philomath")) {
			pw.println("login success");
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", name);
			session.setAttribute("KuchOrB", 562145487);
			request.getRequestDispatcher("home.html").include(request, response);
		} else {
			pw.println("u r not a valid user");
		}

	}

}
