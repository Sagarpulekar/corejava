package com.linkedlistdemo;

import java.util.LinkedList;

public class SwapElementsInLinkedList {
	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();

		List.add("apple");
		List.add("banana");
		List.add("orange");

		System.out.println("Linked List before swapping elements: " + List);

		int firstIndex = 0;
		int secondIndex = 1;
		String temp = List.get(firstIndex);
		List.set(firstIndex, List.get(secondIndex));
		List.set(secondIndex, temp);

		System.out.println("Linked List after swapping elements: " + List);

	}

}
