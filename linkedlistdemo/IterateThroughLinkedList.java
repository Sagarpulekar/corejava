package com.linkedlistdemo;

import java.util.LinkedList;

public class IterateThroughLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();

		// adding some elements to the linked list
		List.add("apple");
		List.add("banana");
		List.add("orange");

		// iterating through all elements in the linked list
		for (String element : List) {
			System.out.println(element);
		}
	}
}
