package com.linkedlistdemo;

import java.util.LinkedList;

public class DisplayElementsAndPositionsInLinkedList {
	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");
		for (int i = 0; i < List.size(); i++) {
			System.out.println("Position " + i + ": " + List.get(i));
		}
	}
}
