package com.java8demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    public int rollNo;
    public String name;
    
    public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Ram"));
        students.add(new Student(103, "Sonu"));
        students.add(new Student(1043, "Ramesh"));
        students.add(new Student(107, "Rakesh"));
        students.add(new Student(102, "Sandeep"));
        students.add(new Student(1024, "Ajay"));

        System.out.println("Before sorting "+students);
        Collections.sort(students, new StudentRollNoComparator());
        System.out.println("After sorting "+students);

        System.out.println(" ++++++++++++++++++++++++++++++++++++++++++ ");

        System.out.println("Before sorting "+students);
        Collections.sort(students, new StudentNameComparator());
        System.out.println("After sorting "+students);


    }
}

class StudentRollNoComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o) {
        if (o1.rollNo > o.rollNo) {
            return +1;
        } else if (o1.rollNo < o.rollNo) {
            return -1;
        } else if (o1.rollNo == o.rollNo) {
            return 0;
        }
        return 0;
    }
}
class StudentNameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o) {
        return o1.name.compareTo(o.name);
    }
}
