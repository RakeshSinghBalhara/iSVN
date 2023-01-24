package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //MIME
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		String userEmail = request.getParameter("userEmail");
		String userCountry = request.getParameter("userCountry");
//		out.print("<html>");
//		out.print("<body>");
		out.print("<h2> Name is "+userName+" </h2>");
		out.print("<h2> Email is "+userEmail+" </h2>");
		out.print("<h2> userPass is "+userPass+" </h2>");
		out.print("<h4> userCountry is "+userCountry+" </h4>");
		saveUserDetails(userName, userPass, userEmail, userCountry);
		out.print("<a href=index.html>Home</a>");
//		out.print("</body>");
//		out.print("</html>");
	}

	private void saveUserDetails(String userName, String userPass, String userEmail, String userCountry) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("class loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
			System.out.println("connection created");
			PreparedStatement stmt=connection.prepareStatement("insert into REGISTERUSER values(?,?,?,?)");  
			stmt.setString(1, userName);
			stmt.setString(2, userPass);
			stmt.setString(3, userEmail);
			stmt.setString(4, userCountry);
			stmt.execute();
			System.out.println("insersted");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
