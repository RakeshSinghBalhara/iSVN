package com.java8demo.day6;

import java.time.LocalDate;
import java.time.Period;

public class AgeCountTest {
	
	public static void main(String[] args) {

		LocalDate dob = LocalDate.of(1989, 04, 26);
		LocalDate curDate = LocalDate.now();  
		Period between = Period.between(dob, curDate);
		System.out.println(between.getYears());
		System.out.println(between.getMonths());
		System.out.println(between.getDays());
		
		System.out.println(between.toTotalMonths());
		
	}

}
