package com.java8demo.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {
	
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
		myCoords.add(560);
		myCoords.add(42);
		myCoords.add(25);
		

		Stream<Integer> stream = myCoords.stream();
		Stream<Integer> stream2 = stream.filter((Integer a)-> a>=50);
		stream2.forEach(System.out::println);

		Stream.of(45, 67, 89, 6, 45, 34, 8, 89, 90).filter(a -> a <= 40).forEach(System.out::println);
		Stream.of(45, 67, 89, 6, 45, 34, 8, 89, 90).forEach(a -> System.out.println(a * 2));
		
		
		
		Function<Integer, Integer> f = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t*2;
			}
		};
		
		
		System.out.println("---------------");
		System.out.println(f.apply(23));
		
		System.out.println("+++++++++++++++++++++++");

		List<Integer> list2 = Stream.of(45, 67, 89, 6, 45, 34, 8, 89, 90).map(a->a*10).collect(Collectors.toList());
		Stream.of(45, 67, 89, 6, 45, 34, 8, 89, 90).map(a->a*1000).forEach(System.out::println);
		
		list2.stream().forEach(System.out::println);
	}

}
