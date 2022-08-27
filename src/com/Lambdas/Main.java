package com.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        new Thread(() -> {
//            System.out.println("Printing from the Main class");
//            System.out.println("Line 2");
//            System.out.println("Line 3");
//        }).start();

        Employee john = new Employee("Jhon Doe", 30);
        Employee tim = new Employee("Tim Doe", 21);
        Employee jack = new Employee("Jack Doe", 44);
        Employee dan = new Employee("Dan Doe", 17);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);
        employeeList.add(dan);

//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.getName().compareTo(emp2.getName());
//            }
//        });

        Collections.sort(employeeList, (Employee emp1, Employee emp2) -> emp1.getName().compareTo(emp2.getName()));

        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}