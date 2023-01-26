package com.java8demo.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8demo.Student;

public class StudentSortingDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Ram"));
        students.add(new Student(103, "Sonu"));
        students.add(new Student(1043, "Ramesh"));
        students.add(new Student(107, "Rakesh"));
        students.add(new Student(102, "Sandeep"));
        students.add(new Student(1024, "Ajay"));
        

        Collections.sort(students, new StudentNameComparator());
        		
        Collections.sort(students, new Comparator<Student>() {
        	@Override
        	public int compare(Student o1, Student o2) {
        		return o1.getName().compareTo(o2.getName());
        	}
		});

        Collections.sort(students, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }
}


class StudentNameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o) {
        return o1.name.compareTo(o.name);
    }
}
