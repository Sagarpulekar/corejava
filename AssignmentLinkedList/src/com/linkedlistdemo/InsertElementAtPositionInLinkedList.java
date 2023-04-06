package com.linkedlistdemo;

import java.util.LinkedList;

public class InsertElementAtPositionInLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");

		// inserting element grape at position 1
		List.add(1, "grape");
		System.out.println(List);

	}

}
