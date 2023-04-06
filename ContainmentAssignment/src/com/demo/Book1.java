package com.demo;

public class Book1 {
	private int bid;
	private String bookName;
	private float bprice;
	private String type;
	private Author author;

	public Book1() {

	}

	public Book1(int bid, String bookName, float bprice, String type, Author author) {
		this.bid = bid;
		this.bookName = bookName;
		this.bprice = bprice;
		this.type = type;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public float getBprice() {
		return bprice;
	}

	public void setBprice(float bprice) {
		this.bprice = bprice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book Id" + bid + "\nBookName=" + bookName + "\nBook price=" + bprice + "\nType of Book=" + type
				+ "\nAuthor=" + author + "]";
	}
}
