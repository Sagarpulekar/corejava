package com.linkedlistdemo;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {

	public static void main(String[] args) {

		LinkedList<String> List = new LinkedList<>();
		List.add("apple");
		List.add("banana");
		List.add("orange");

		System.out.println("Linked List before shuffling elements: " + List);

		Collections.shuffle(List);

		System.out.println("Linked List after shuffling elements: " + List);

	}

}
