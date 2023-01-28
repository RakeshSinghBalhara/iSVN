package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

		public void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String userName = request.getParameter("username");
			String userPass = request.getParameter("password");

			if (userPass.equals("123")) {
				RequestDispatcher rd = request.getRequestDispatcher("welcomeServlet");
				rd.forward(request, response);
			} else {
				out.print("Sorry User Name or Password Error!");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.include(request, response);

			}
		}
}
