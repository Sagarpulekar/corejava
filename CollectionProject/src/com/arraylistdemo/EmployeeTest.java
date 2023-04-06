package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("sagar", 15000));
		employees.add(new Employee("bhushan", 8000));
		employees.add(new Employee("suyog", 12000));
		employees.add(new Employee("chinamy", 10000));
		employees.add(new Employee("pritish", 20000));

		Collections.sort(employees);

		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.getSalary() > 10000) {
				System.out.println(employee);
			}
		}
	}
}
