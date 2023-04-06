package com.linkedlistdemo;

import java.util.LinkedList;

public class InsertMultipleElementsAtPositionInLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");
		LinkedList<String> List1 = new LinkedList<>();
		List1.add("grape");
		List1.add("kiwi");
		List.addAll(1, List1);

		System.out.println(List);
	}

}
