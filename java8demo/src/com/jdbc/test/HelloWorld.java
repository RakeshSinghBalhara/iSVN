package com.jdbc.test;

public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("Hello from hello world");
	}
	
	static {
		System.out.println("Hello from static hello world");
	}
	{
		System.out.println("Hello from init bloack");
	}

	void show() {
		System.out.println("show from helloworld");
	}
}
