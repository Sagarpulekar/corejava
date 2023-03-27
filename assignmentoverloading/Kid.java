package com.assignmentoverloading;

public class Kid {
	public int rollno;
	public String kName;
	public int kAge;

	public void readBook() {
	}

	public void readBook(int rollno, String kName, int kAge) {
		this.rollno = rollno;
		this.kName = kName;
		this.kAge = kAge;
	}

	public void display() {
		System.out.println("Kid RollNo:-" + rollno + "\nKid Name is" + kName + "\nKid Age is" + kAge);

	}

}
