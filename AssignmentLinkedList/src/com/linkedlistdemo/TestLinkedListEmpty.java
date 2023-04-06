package com.linkedlistdemo;

import java.util.LinkedList;

public class TestLinkedListEmpty {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		if (list.isEmpty()) {
			System.out.println("The linked list is empty.");
		} else {
			System.out.println("The linked list is not empty.");
		}
		list.add("apple");

		if (list.isEmpty()) {
			System.out.println("The linked list is empty.");
		} else {
			System.out.println("The linked list is not empty.");
		}
	}
}
