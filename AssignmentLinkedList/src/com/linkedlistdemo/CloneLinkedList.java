package com.linkedlistdemo;

import java.util.LinkedList;

public class CloneLinkedList {

	public static void main(String[] args) {

		LinkedList<String> originalList = new LinkedList<>();

		originalList.add("apple");
		originalList.add("banana");
		originalList.add("orange");

		LinkedList<String> clonedList = new LinkedList<>(originalList);

		System.out.println("Original Linked List: " + originalList);
		System.out.println("Cloned Linked List: " + clonedList);
	}
}
