package com.queuedemo;

class Book {
	int id;
	String name;
	String author;
	String publisher;

	public Book(int id, String name, String author, String publisher) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

	public String toString() {
		return "Book id=" + id + " name=" + name + " author=" + author + " publisher=" + publisher;
	}

}

public class ProrityQueueExample {

}
