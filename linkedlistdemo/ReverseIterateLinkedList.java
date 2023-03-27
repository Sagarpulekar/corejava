package com.linkedlistdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseIterateLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();

		List.add("apple");
		List.add("banana");
		List.add("orange");
		List.add("grape");
		List.add("peach");

		// get a list iterator starting at the end of the linked list
		ListIterator<String> iterator = List.listIterator(List.size());

		// iterate through all elements in reverse order
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());

		}
	}

}
