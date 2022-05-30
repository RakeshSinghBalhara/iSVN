package com.java8demo;

import java.util.*;

public class EmployeeDuplicateDemo {
    public static void main(String[] args) {

        User ram = new User(1, "Ram");
        User ram2 = new User(1, "Ram");
        User ramesh = new User(12, "Ramesh");
        User ramu = new User(13, "Ramu");

        Set<User> users = new HashSet<>();
        users.add(ram);
        users.add(ram2);
        users.add(ramesh);
        users.add(ramu);
        System.out.println("Set size " + users.size());

        Map<User, Integer> map = new HashMap<>();

        map.put(ram, 1);
        map.put(ramesh, 2);
        map.put(ram2, 3);
        map.put(ramu, 4);
        System.out.println("Map size " + map.size());
    }

}

class User {
    int empId;
    String name;

    public User(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return this.empId == user.empId && Objects.equals(this.name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.empId, this.name);
    }

    //    @Override
//    public String toString() {
//        return "User{" + "empId=" + empId + ", name='" + name + '\'' + '}';
//    }


}