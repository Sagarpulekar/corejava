package com.linkedlistdemo;

import java.util.LinkedList;

public class RemoveFirstAndLastElementFromLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();

		List.add("apple");
		List.add("banana");
		List.add("orange");

		List.removeFirst();

		List.removeLast();
		System.out.println(List);
	}

}
