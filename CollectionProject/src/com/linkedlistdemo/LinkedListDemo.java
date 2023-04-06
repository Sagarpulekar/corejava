package com.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("sagar");
		list1.add("bhushan");
		list1.add("pritish");
		list1.add("sam");
		list1.add("shree");
		System.out.println(list1);

		list1.add("chinmay"); // added at last
		list1.addFirst("java"); // added at first
		list1.addLast("python"); // added at last
		System.out.println(list1);

		list1.offer("angular"); // added at last
		list1.addFirst(" ");
		System.out.println(list1);

		list1.remove();
		// System.out.println(list1);// it removes 1st element from queue
		String firstelement = list1.element();
		System.out.println("first element" + firstelement);
		System.out.println("first element" + list1.getFirst());

		String s = list1.get(0);
		System.out.println(s);
		System.out.println(list1.get(2));
		System.out.println("--------------------");
		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------");
		ListIterator<String> itr1 = list1.listIterator(list1.size());
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
	}
}
