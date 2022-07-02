package com.java8demo.day5;

import java.util.stream.Stream;

public class CountExample {
	public static void main(String[] args) {
		
		

		long count = Stream.of(10,11,45,32,86,46,46).filter(t -> t > 40).count();
		System.out.println("Total count of emp " + count);

		long count2 = Stream.of(10,11,46,45,32,86,46).filter(t -> t > 40).distinct().count();
		System.out.println("Total count2 of emp " + count2);
	}
}
