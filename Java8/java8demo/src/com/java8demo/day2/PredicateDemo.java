package com.java8demo.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {
	public static void main(String[] args) {

		Predicate<Integer> p = (a) -> a % 10 == 0;
		
		Consumer<Integer> c2 = (a) -> {
			if (a % 2 == 0) {
				System.out.println("Even no");
			} else {
				System.out.println("Odd no");
			}
		};

		c2.accept(90);
		c2.accept(901);
		
		System.out.println(p.test(10));
		System.out.println(p.test(100));
		System.out.println(p.test(1002));
		
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
		
		stream.forEach(c2);;
		
//		Stream<Integer> stream2 = Stream.of(23,56,78,890,67,456);
	}
}

class Test2 implements Consumer<Integer>{
	public void accept(Integer t) {
		System.out.println(t);
	}
	public static void main(String[] args) {

		Consumer<Integer> c = new Test2();
		c.accept(56*10);
		c.accept(78788*10);
	}
}
