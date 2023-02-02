package com.staticDemo;

public class Student {
	private int id;
	private String name;
	static String schoolName;
	static int studentcount = 0;
	static {
		schoolName = "Joseph school";
	}

	static {
	}
	// instance block
	{
		id = 100;
		name = "Unknown";
	}
//default constructor
	public Student() {
		id = 000;
		name = "NA";
	}
//paramitirised constructor
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name + " " + schoolName;
	}

	// getter setter of static variable
	static public void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	static public String getSchoolName() {
		return Student.schoolName;
	}

	public static void main(String[] args) {

		System.out.println("School name:" + schoolName);
		// System.out.println("ID:"+id); : Error
		Student s1 = new Student(101, "Pritish");
		System.out.println("school name:" + schoolName);
		System.out.println(s1);

		Student s2 = new Student(102, "Kunal");
		System.out.println(s2);

		schoolName = "St Mary";

		System.out.println(s1);
		System.out.println(s2);

	}

}
