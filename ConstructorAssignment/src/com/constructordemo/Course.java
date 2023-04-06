package com.constructordemo;

public class Course {

	private int courseId;
	private String courseName;
	private int subCourseId;
	private String subCourseName;

	public Course() {
		System.out.println("YOU ARE IN DEFAULT CONSTRUCTOR NO 1");
		this.courseId = 101;
		this.courseName = "MECHANICAL";

	}

	public Course(int Id, String Name) {
		System.out.println("YOU ARE IN DEFAULT CONSTRUCTOR NO 2");
		this.subCourseId = 501;
		this.subCourseName = "NDT";
	}

	public void display() {
		System.out.println(subCourseId + "      " + subCourseName);
		System.out.println(courseId + "      " + courseName);
	}
}
