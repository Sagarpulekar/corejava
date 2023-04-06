package com.customDemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(101, "sagar", 25, 50000));
		employees.add(new Employee(102, "bhushan", 30, 60000));
		employees.add(new Employee(103, "pritish", 25, 55000));
		employees.add(new Employee(104, "suyog", 30, 55000));
		employees.add(new Employee(105, "omkar", 35, 70000));
		employees.add(new Employee(106, "yashank", 30, 65000));
		employees.add(new Employee(107, "vivek", 25, 45000));
		employees.add(new Employee(108, "adinath", 35, 75000));

		Collections.sort(employees);

		for (Employee employee : employees) {
			System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Age: "
					+ employee.getAge() + ", Salary: " + employee.getSalary());
		}
	}
}
