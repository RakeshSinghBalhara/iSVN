package com.java8demo.day2;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {

		Predicate<Integer> p = (a) -> a % 10 == 0;

		System.out.println(p.test(10));
		System.out.println(p.test(100));
		System.out.println(p.test(1002));
	}
}
