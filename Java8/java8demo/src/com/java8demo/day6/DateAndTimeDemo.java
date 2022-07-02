package com.java8demo.day6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/dd/MM");
		String strDate = formatter.format(d);
		System.out.println(d);
		System.out.println(strDate);

		LocalDate local = LocalDate.now();
		System.out.println(local);
		LocalDate days = local.minusDays(10);
		System.out.println(days);
		System.out.println(days.getDayOfMonth());

		LocalDate leapyear = LocalDate.of(2000, 3, 07);
		System.out.println(leapyear);
		System.out.println(leapyear.minusDays(10));

		LocalDateTime leapyear2 = LocalDateTime.now();
		System.out.println(leapyear2);
		System.out.println(leapyear2.minusDays(10));

		LocalTime time = LocalTime.now();
		System.out.println(time);
	    LocalTime time2=time.minusHours(2);  
	    System.out.println(time2);
	    LocalTime time3=time.minusMinutes(34);  
	    System.out.println(time3);
	}
}
