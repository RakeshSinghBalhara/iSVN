package com.java8demo.day6;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] st = new String[10];
		st[0]="Test";
		st[2]="Hello ";

		System.out.println(st[0].length());
//		System.out.println(st[2].length());
		
		if (st[2] != null) {
			System.out.println(st[2]);
		}
		
		Optional<String> optional = Optional.ofNullable(st[2]);
		Optional<Integer> optional2 = Optional.of(677);
		
//		if(optional2.isPresent()) {
			System.out.println(optional2.get());
//		}
		
		System.out.println(optional.isPresent());
		if(optional.isPresent()) {
			System.out.println("Value is "+optional.get());
		}else {
			System.out.println("Else part");
		}

	}

}
