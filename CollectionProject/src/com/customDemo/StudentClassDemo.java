package com.customDemo;

public class StudentClassDemo implements Comparable<StudentClassDemo> {
	private int sId;
	private String sName;
	private int sAge;
	private float sMarks;

	public StudentClassDemo(int sId, String sName, int sAge, float sMarks) {
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sMarks = sMarks;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public float getsMarks() {
		return sMarks;
	}

	public void setsMarks(float sMarks) {
		this.sMarks = sMarks;
	}

	public String toString() {
		return "Student Id:-" + sId + " Student Name:-" + sName + "Student Age:-" + sAge + "Student Marks:-" + sMarks;
	}

	@Override
	public int compareTo(StudentClassDemo o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
