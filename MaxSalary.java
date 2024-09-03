package com.simple.examples;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSalary {



	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("Alice", 50000));
	        employees.add(new Employee("Bob", 60000));
	        employees.add(new Employee("Charlie", 70000));
	        employees.add(new Employee("David", 60000));
	        employees.add(new Employee("Eve", 80000));

	        double secondMaxSalary = findSecondMaxSalary(employees);
	        System.out.println("The second highest salary is: " + secondMaxSalary);
	    }

	    public static double findSecondMaxSalary(List<Employee> employees) {
	        return employees.stream()
	                        .map(Employee::getSalary)
	                        .distinct()
	                        .sorted((s1, s2) -> Double.compare(s2, s1))
	                        .skip(1)
	                        .findFirst()
	                        .orElseThrow(() -> new IllegalArgumentException("Not enough distinct salaries"));
	    }
	}

	class Employee {
	    private String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    
	    
	}

