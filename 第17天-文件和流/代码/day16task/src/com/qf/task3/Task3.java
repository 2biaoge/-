package com.qf.task3;

import java.util.TreeSet;

public class Task3 {
	public static void main(String[] args) {
		TreeSet<Employee> employees=new TreeSet<Employee>();
		employees.add(new Employee(20, 5, 3000));
		employees.add(new Employee(20, 5,3500));
		employees.add(new Employee(19, 2, 5000));
		employees.add(new Employee(22, 8, 8000));
		employees.add(new Employee(30, 10, 30000));
		employees.add(new Employee(20, 4, 5000));
		employees.add(new Employee(22, 3, 4000));
		employees.add(new Employee(22, 3, 4000));
		employees.add(new Employee(22, 3, 4000));
		
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
		
	}
}
