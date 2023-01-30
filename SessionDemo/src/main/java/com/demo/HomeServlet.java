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
 * Servlet implementation class HomeServlet
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String String = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		
		if (session == null) {
			out.print("<h1>Please login first</h1>");
//			request.getRequestDispatcher("index.html").include(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		} else {
			String attribute = (String) session.getAttribute("sessionId");
			Integer attribute2 =(Integer)  session.getAttribute("KuchOrB");
			out.print("<h1>Welcome --> " + attribute + "</h1>"+attribute2);
			out.print("<h2>KuchOrB " + attribute2 + "</h2>");
			out.print("<a href=LogoutServlet>Logout</a>");
		}
	}
}
