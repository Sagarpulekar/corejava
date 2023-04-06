package com.SwitchExampleDemo;

import java.util.Scanner;

public class Areaofall {

	public static void main(String[] args) {
		float area, radius, side1, base, height, length, breadth, circum, perimeter;
		Scanner sc = new Scanner("System.in");
		System.out.println("Enter 1 for area of Circle");
		System.out.println("2 for area of Square");
		System.out.println("3 for area of right angled triangle");
		System.out.println("4 for area of Rectangle");
		System.out.println("5 for Circumference of Circle");
		System.out.println("6 for Perimeter of Square");
		System.out.println("Please enter any of the above option: ");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("ENTER RADIUS OF CIRCLE(in cm):");
			radius = sc.nextFloat();
			area = 3.14f * radius * radius;
			System.out.println("AREA OF CIRCLE:" + area + "sq cm");
			break;
		case 2:
			System.out.println("ENTER SIDE OF SQUARE (in cm):");
			side1 = sc.nextFloat();
			area = side1 * side1;
			System.out.println("AREA OF SQUARE:" + area + "sq cm");
			break;
		case 3:
			System.out.println("ENTER BASE OF RIGHT ANGLE TRIANGLE(in cm):");
			base = sc.nextFloat();
			System.out.println("ENTER HEIGHT OF RIGHT ANGLE TRIANGLE(in cm):");
			height = sc.nextFloat();
			area = (base * height) / 2;
			System.out.println("AREA OF RIGHT ANGLE TRIANGLE:" + area + "sq cm");
			break;
		case 4:
			System.out.println("ENTER LENGTH OF RECTANGLE(in cm):");
			length = sc.nextFloat();
			System.out.println("ENTER BREADTH OF RECTANGLE(in cm):");
			breadth = sc.nextFloat();
			perimeter = length * breadth;
			System.out.println("Perimeter of Rectangle is: " + perimeter + "sqcm");
			break;
		case 5:
			System.out.println("ENTER RADIUS OF CIRCLE(in cm):");
			radius = sc.nextFloat();
			circum = 2 * 3.14f * radius;
			System.out.println("AREA OF CIRCLE:" + circum + "sq cm");
			break;
		case 6:
			System.out.println("ENTER SIDE OF SQUARE (in cm):");
			side1 = sc.nextFloat();
			perimeter = side1 * 4;
			System.out.println("PERIMETER OF SQUARE:" + perimeter + "cm");
			break;
		default:
			System.out.println("Sorry, Invalid Choice");
			sc.close();
		}

	}

}
