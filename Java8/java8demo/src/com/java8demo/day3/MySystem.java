package com.java8demo.day3;

import java.util.ArrayList;
import java.util.List;

public interface MySystem {
	void show(String x);

	public static void main(String[] args) {
		MySystem m = Hello::show;
		m.show("Rakesh");
	}

	class Hello {
		public static void show(String x) {
			System.out.println("Hello " + x);
		}
	}
}

class Hello {
	public static void show(int x) {
		System.out.println(x);
	}
}

class Demo4 {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(30);
		mylist.add(20);
		mylist.add(50);
		mylist.add(10);
		mylist.add(40);
		mylist.stream().forEach(Hello::show); // Static Method Ref Style
		System.out.println("-------------------");
		mylist.stream().forEach(System.out::println); // Instance Method Ref Style
		System.out.println("-------------------");
		mylist.stream().forEach((x) -> System.out.println(x)); // Eambda Style
	}
}