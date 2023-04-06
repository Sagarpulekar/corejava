package com.arraylistdemo;

class Employee implements Comparable<Employee> {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int compareTo(Employee employee) {
		if (salary > employee.getSalary()) {
			return -1;
		} else if (salary < employee.getSalary()) {
			return 1;
		} else {
			return name.compareTo(employee.getName());
		}
	}

	public String toString() {
		return "Employee Name:-" + name + "Employee salary:-" + salary;
	}
}
