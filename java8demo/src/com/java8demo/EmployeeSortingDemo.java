package com.java8demo;

import java.util.*;

public class EmployeeSortingDemo {

    public static void main(String[] args) {

//        Set<Integer> myCoords = new HashSet<Integer>();
//        Set<Integer> myCoords = new LinkedHashSet<Integer>();
//        Set<Integer> myCoords = new TreeSet<>();
//        myCoords.add(10);
//        myCoords.add(20);
//        myCoords.add(30);
//        myCoords.add(20);
//        myCoords.add(30);
//        myCoords.add(2);
//        myCoords.add(830);
//        myCoords.add(40);
//        myCoords.add(50);
//        myCoords.add(42);
//        myCoords.add(25);
//
//        myCoords.stream().forEach(i-> System.out.println(i));

//        List<Employee> employees = new ArrayList<Employee>();
//        Set<Employee> employees = new HashSet<>();
        Set<Employee> employees = new TreeSet<>();
        employees.add(new Employee(101, "Ram"));
        employees.add(new Employee(103, "Sonu"));
        employees.add(new Employee(1043, "Ramesh"));
        employees.add(new Employee(107, "Rakesh"));
        employees.add(new Employee(102, "Sandeep"));
        employees.add(new Employee(102, "Sandeep1"));

        employees.stream().forEach(i-> {
            System.out.println("Emp Id "+i.empId+" Emp Name "+i.name);
        });
//        System.out.println(employees);
//        Collections.sort(employees);


//[Employee{empId=101, name='Ram'}, Employee{empId=103, name='Sonu'}, Employee{empId=107, name='Rakesh'}]
    }
}

class Employee implements Comparable<Employee> {
    int empId;
    String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    @Override
    public int compareTo(Employee o) {
        if (this.empId > o.empId) {
            return +1;
        } else if (this.empId < o.empId) {
            return -1;
        } else if (this.empId == o.empId && this.name == o.name) {
            return 0;
        }
        return +1;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empId=" + empId +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
