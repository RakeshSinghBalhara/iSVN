package com.java8demo.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EvenNoTest {
	public static void main(String[] args) {

		List<Integer> myCoords = new ArrayList<>();
		myCoords.add(10);
		myCoords.add(20);
		myCoords.add(33);
		myCoords.add(20);
		myCoords.add(30);
		myCoords.add(2);
		myCoords.add(830);
		myCoords.add(40);
		myCoords.add(50);
		myCoords.add(42);
		myCoords.add(25);
		

		Stream<Integer> stream = myCoords.stream();

		myCoords.stream().forEach(System.out::println);

		System.out.println("-------------------ABOVE-----------------------");
		
		myCoords.stream().forEach((a) -> System.out.println("No is " + a));
		
		System.out.println("------------------------------------------");
		
		stream.forEach((a) -> {
			if (a % 2 == 0) {
				System.out.println("Even no "+a);
			} else {
				System.out.println("Odd no "+a);
			}
		});
	}
}
