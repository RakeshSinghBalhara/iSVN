package com.jdbc.test;

public class JDBCDemo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class<HelloWorld> forName = (Class<HelloWorld>) Class.forName("com.jdbc.test.HelloWorld");
		HelloWorld newInstance = forName.newInstance();
		newInstance.show();
		
		String str = "Hello";
		System.out.println(str.length());
	}

}
