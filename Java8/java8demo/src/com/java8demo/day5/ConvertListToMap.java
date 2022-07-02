package com.java8demo.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "Ram", 10000));
		employees.add(new Employee(102, "Ram3", 30000));
		employees.add(new Employee(105, "Ram6", 90000));
		employees.add(new Employee(105, "Ram6", 900000));
		employees.add(new Employee(105, "Ram6", 90000));
		employees.add(new Employee(103, "Ram2", 16000));
		employees.add(new Employee(104, "Ram5", 80000));
		employees.add(new Employee(106, "Ram8", 20000));
		employees.add(new Employee(107, "Ram9", 15000));
		
		int sum2=10;
		Function< Employee,Float> f = new Function<Employee,Float>() {
			public Float apply(Employee t) {
				return sum2+t.getSalary();
			}
		};
		
		List<Float> sumList = employees.stream().map(f).collect(Collectors.toList());
		
		System.out.println("sum "+sumList);
		
		Map<Integer, String> employeeMap = employees.stream().distinct().collect(
				Collectors.toMap(Employee::getEmpId, Employee::getEmpName, (e, e2)-> e));
		System.out.println(employeeMap);
		
		Map<Integer, String> map =  new HashMap<Integer, String>();
		map.put(101, "ram1");
		map.put(101, "ram1");
		map.put(102, "ram2");
		
		System.out.println(map);
		
	}
}
