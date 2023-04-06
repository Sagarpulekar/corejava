package com.demo;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Author a1 = new Author(12345, "ADAMGRANT", "25101957");
		Book1 b1 = new Book1();
		System.out.println("Enter Book Id:-");
		b1.setBid(sc.nextInt());
		System.out.println("Enter Book Name:-");
		b1.setBookName(sc.next());
		System.out.println("Enter Book Price:-");
		b1.setBprice(sc.nextFloat());
		System.out.println("Type of Book:-");
		b1.setType(sc.next());
		System.out.println("Author Details:-");
		b1.setAuthor(a1);

		// Book1 b1 = new Book1(101, "Give and Take", 200.00f, "sucess", a1);
		System.out.println(a1);
		System.out.println(b1);
	}

}
