package com.gettersetter;

import java.util.Scanner;

public class CompanyDetails {
	public static void EmployeeDetail(EmployeeDetail e) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE ID:");
		e.setEmployeeId(sc.nextInt());
		System.out.println("ENTER EMPLOYEE NAME:");
		e.setEmployeeName(sc.next());
		System.out.println("ENTER EMPLOYEE SALARY:");
		e.setEmployeeSalary(sc.nextDouble());
		System.out.println("ENTER EMPLOYEE AGE:");
		e.setEmployeeAge(sc.nextInt());
		System.out.println("ENTER EMPLOYEE EXPERIENCE:");
		e.setEmployeeSalary(sc.nextDouble());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDetail e1 = new EmployeeDetail();
		System.out.println("EmployeeDetails");
		EmployeeDetail(e1);
		System.out.println(e1);
		EmployeeDetail e2 = new EmployeeDetail();
		EmployeeDetail(e2);
		System.out.println(e2);

	}
}