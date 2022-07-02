package com.java8demo.day6;

public class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(101, "Rakesh");
		System.out.println(emp.toString());
		System.out.println(emp);
		
		System.out.println();
	}
}
