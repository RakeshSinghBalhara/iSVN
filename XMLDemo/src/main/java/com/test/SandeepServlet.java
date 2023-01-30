package com.test;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SandeepServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config = this.getServletConfig();
		String parameter = config.getInitParameter("emailToken");
		
		ServletContext context = getServletContext();
		String dbName = context.getInitParameter("dbName");
		response.getWriter().append("Served at: ServletContext <br> dbName is "+dbName).append(request.getContextPath());
		response.getWriter().append("<br> Served at: SandeepServlet <br> Email is "+parameter).append(request.getContextPath());
	}

}
