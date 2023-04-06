package com.containmentarray;

public class Student {
	private int sid;
	private String name;
	private float marks;
	private Course course;

	public Student() {

	}

	public Student(int sid, String name, float marks, Course course) {
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String toString() {
		return "Student:" + sid + "" + name + " " + marks + " " + course;
	}
}
