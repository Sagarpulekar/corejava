package com.linkedlistdemo;

import java.util.LinkedList;

public class AppendElementToLinkedList {

	public static void main(String[] args) {
		LinkedList<String> List = new LinkedList<>();

		// adding elements to the linked list
		List.add("apple");
		List.add("banana");
		List.add("orange");

		// appending a new element to the end of the linked list
		List.add("grape");

		System.out.println(List);
	}
}
