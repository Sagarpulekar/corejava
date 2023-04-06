package com.gettersetter;

public class EmployeeDetail {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private int employeeAge;
	private double employeeExperience;

	
	public EmployeeDetail() {
		System.out.println("Default Constructor");
		this.employeeId = 101;
		this.employeeName = "unknown";
		this.employeeSalary = 0000;
		this.employeeAge = 00;
		this.employeeExperience = 0;
	}

	public EmployeeDetail(double employeeExperience) {
		System.out.println("Constructor 1");
		this.employeeExperience = 0;
	}

	public EmployeeDetail(int employeeId, String employeeName, double employeeSalary, int employeeAge,
			double employeeExperience) {
		System.out.println("Constructor 2");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAge = employeeAge;
		this.employeeExperience = employeeExperience;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public double getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeExperience(double employeeExperience) {
		this.employeeExperience = employeeExperience;
	}

	public double getEmployeeExperience() {
		return employeeExperience;
	}

	/*
	 * public void display() { System.out.println(employeeId + "   " + employeeName
	 * + "   " + employeeSalary + "   " + employeeAge + "  " + employeeExperience);
	 * }
	 */
	public String toString() {
		return "EMPLOYEE ID:-" + employeeId + "\nEMPLOYEE NAME:-" + employeeName + "\nEMPLOYEE SALARY:-"
				+ employeeSalary + "\nEMPLOYEE AGE" + employeeAge + "\nEMPLOYEE EXPERIENCE  " + employeeExperience;
	}
}
