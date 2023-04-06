package com.demo;

public class Author {
	private int authorid;
	private String aname;
	private String dob;

	public Author() {

	}

	public Author(int authorid, String aname, String dob) {
		this.authorid = authorid;
		this.aname = aname;
		this.dob = dob;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;

	}

	@Override
	public String toString() {
		return "Author Id" + authorid + "\nAuthor Name" + aname + "\nDateOfBirth=" + dob + "]";
	}

}
