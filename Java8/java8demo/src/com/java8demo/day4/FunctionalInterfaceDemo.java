package com.java8demo.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		Predicate<String> p = (x) -> x.length() > 9;
		System.out.println(p.test("Rakesh"));
		
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
		
		
		
	}

}

//class Test implements Predicate<String>{
//
//	@Override
//	public boolean test(String t) {
//		return t.length()>9;
//	}
//	
//}