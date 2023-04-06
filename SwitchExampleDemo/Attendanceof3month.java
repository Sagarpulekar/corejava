package com.SwitchExampleDemo;

import java.util.Scanner;

public class Attendanceof3month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ATTENDANCE FOR JANUARY MONTH");
		int x = sc.nextInt();
		System.out.println("ATTENDANCE FOR FEBRUARY MONTH");
		int y = sc.nextInt();
		System.out.println("ATTENDANCE FOR MARCH MONTH");
		int z = sc.nextInt();
		float sum = x + y + z;
		int total = 90; // total number of classes
		float attend;
		attend = ((sum * 100) / total);
		if ((attend >= 75) && (attend <= 100)) {
			System.out.println("ALLOW TO GIVE EXAM:" + attend + "%");
		} else if (attend >= 60) {
			System.out.println(" WARNING TO GIVE MOCK EXAM  :" + attend + "%");
		} else if (attend < 60) {
			System.out.println(" YOU ARE NOT ELIGIBLE:" + attend + "%");
		} else {
			System.out.println("ERROR!!INVALID INPUT");
			sc.close();

		}
	}
}
