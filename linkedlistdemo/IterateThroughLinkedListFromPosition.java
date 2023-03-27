package com.linkedlistdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateThroughLinkedListFromPosition {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");
		List.add("grape");
		List.add("peach");

		// get a list iterator starting at position 2
		ListIterator<String> iterator = List.listIterator(2);

		// iterate through all elements starting at position 2
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
