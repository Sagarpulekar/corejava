package com.constructordemo;

public class CourseTest {

	public static void main(String[] args) {
		Course c1 = new Course();
		c1.display();
		System.out.println("--------------------");
		Course c2 = new Course(501, "NDT");
		c2.display();
	}

}
