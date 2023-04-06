package com.linkedlistdemo;

import java.util.LinkedList;

public class GetFirstAndLastOccurrenceInLinkedList {
	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();

		List.add("apple");
		List.add("banana");
		List.add("orange");
		List.add("banana");

		int firstIndex = List.indexOf("banana");
		int lastIndex = List.lastIndexOf("banana");
		System.out.println("First occurrence of 'banana': " + firstIndex);
		System.out.println("Last occurrence of 'banana': " + lastIndex);
	}
}
