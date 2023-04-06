package com.demo;

public class StudentCourseTest {

	public static void main(String[] args) {
		Course c1 = new Course(101, "Java", 89000f);
		Course c2 = new Course(102, ".net", 78000f);
		Course c3 = new Course(103, "Python", 89666f);

		StudentCourse s1 = new StudentCourse(1, "Sagar", c1);
		StudentCourse s2 = new StudentCourse(2, "shree", c1);
		StudentCourse s3 = new StudentCourse(3, "sam", c2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("------------------------");

		c1.setCname("Core Java");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("--------------------------");

		StudentCourse s4 = new StudentCourse(4, "adi");
		System.out.println(s4);

		s4.setCourse(c3);

		System.out.println(s4);

		s4.setCourse(c2);
		System.out.println(s4);

	}

}
