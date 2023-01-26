package com.java8demo.day6;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class ZoneIdTest {
	
	public static void main(String[] args) {
		ZoneId zone1 = ZoneId.of("Asia/Kolkata"); 
	    LocalTime time1 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time1); 
	    
	    
	    ZoneId zone2 = ZoneId.of("Asia/Tokyo"); 
	     
	    LocalTime time2 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time2);  
	    
	    long hours = ChronoUnit.HOURS.between(time1, time2);  
	    System.out.println("Hours between two Time Zone: "+hours);
	    
	    long minutes = ChronoUnit.MINUTES.between(time1, time2);  
	    System.out.println("Minutes between two time zone: "+minutes);  
	    
	    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
	    availableZoneIds.stream().forEach(a-> {
	    	System.out.println(a+" Current Time "+LocalTime.now(ZoneId.of(a)));
	    });
	    
	}

}
