package com.collectionassignment;

class Employee implements Comparable<Employee> {
	private int empId;
	private String name;

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee empId=" + empId + " name=" + name;
	}

	@Override
	public int compareTo(Employee o) {
		if (empId > o.getEmpId()) {
			return 1;
		} else if (empId < o.getEmpId()) {
			return -1;
		}
		return 0;
	}
}
