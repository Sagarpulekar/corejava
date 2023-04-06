package com.SwitchExampleDemo;

import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice for 10 countries to get pincode and capital: ");
		int c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("COUNTRY:-CHINA\nCAPITAL:-BEIJING\nPINCODE:-100000");
			break;

		case 2:
			System.out.println("COUNTRY:-UNITED STATES\nCAPITAL:-WASHINGTON STATES\nPINCODE:-20000");
			break;

		case 3:
			System.out.println("COUNTRY:-INDIA\nCAPITAL:-NEW DELHI\nPINCODE:-110001");
			break;

		case 4:
			System.out.println("COUNTRY:-JAPAN\nCAPITAL:-TOKYO\nPINCODE:-1000000");
			break;
		case 5:
			System.out.println("COUNTRY:-GERMANY\nCAPITAL:-BERLIN\nPINCODE:-101155");
			break;

		case 6:
			System.out.println("COUNTRY:-RUSSIA\nCAPITAL:-MOSCOW\nPINCODE:-101000");
			break;

		case 7:
			System.out.println("COUNTRY:-INDONESIA\nCAPITAL:-JAKARTA\nPINCODE:-10110");
			break;

		case 8:
			System.out.println("COUNTRY:-BRAZIL\nCAPITAL:-BRASILIA\nPINCODE:-70000-000");
			break;
		case 9:
			System.out.println("COUNTRY:-UNITED KINGDOM\nCAPITAL:-LONDON\nPINCODE:-CB-21");
			break;

		case 10:
			System.out.println("COUNTRY:-FRANCE\nCAPITAL:-PARIS\nPINCODE:-75000");
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
