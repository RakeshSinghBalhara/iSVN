package com.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("class loaded");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","root");
		System.out.println("connection created");
		Statement statement = connection.createStatement();
		connection.setAutoCommit(false);
		statement.execute("INSERT INTO `jdbcdemo`.`user` (`id`, `name`) VALUES (25, '25 User')");
		statement.execute("INSERT INTO `jdbcdemo`.`user` (`id`, `name`) VALUES (2, 'Second User')");
		ResultSet rs = statement.executeQuery("select * from user");
		while(rs.next()) {
			System.out.println("Id "+rs.getInt("id")+" name "+rs.getString(2));
		}
		int id = 22;
		statement.execute("INSERT INTO `jdbcdemo`.`user` (`id`, `name`) VALUES ("+id+", 'Second User')");
		PreparedStatement stmt=connection.prepareStatement("insert into user values(?,?)");  
		stmt.setInt(1, 3);
		stmt.setString(2, "Third user");
		stmt.execute();
		statement.close();
//		connection.close();
		connection.commit();
		System.out.println("inserted");
		
		
	}

}
