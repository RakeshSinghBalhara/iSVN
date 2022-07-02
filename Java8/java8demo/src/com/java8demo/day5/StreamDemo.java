package com.java8demo.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Ram", 10000));
		employees.add(new Employee(102, "Ram3", 30000));
		employees.add(new Employee(105, "Ram6", 120000));
		employees.add(new Employee(105, "Ram6", 120000));
		employees.add(new Employee(103, "Ram2", 16000));
		employees.add(new Employee(104, "Ram5", 80000));
		employees.add(new Employee(105, "Ram6", 90000));
		employees.add(new Employee(106, "Ram8", 20000));
		employees.add(new Employee(107, "Ram9", 15000));
		

		Predicate<Employee> p = new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getSalary()>50000;
			}
		};
		
		List<Employee> newList = employees.stream().filter(p).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Employee> newList2 = employees.stream().filter(t -> t.getSalary() > 50000).collect(Collectors.toList());
		System.out.println(newList2);
		long count = employees.stream().filter(t -> t.getSalary() > 50000).count();
		System.out.println("Total count of emp " + count);

		long count2 = employees.stream().filter(t -> t.getSalary() > 50000).distinct().count();
		System.out.println("Total count2 of emp " + count2);
		
		employees.stream().filter(t -> t.getSalary() > 50000).forEach(System.out::println);
		
//		Comparator<Employee> com = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				if (o1.getSalary() > o2.getSalary()) {
//					return 1;
//				} else if (o1.getSalary() < o2.getSalary()) {
//					return -1;
//				} else
//					return 0;
//			}
//			
//		};
		
		Collections.sort(newList, ( o1,  o2) ->{
			if (o1.getSalary() > o2.getSalary()) {
				return 1;
			} else if (o1.getSalary() < o2.getSalary()) {
				return -1;
			} else
				return 0;
		});	
		System.out.println(newList);
		
	}
}

