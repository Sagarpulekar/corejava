package com.vectordemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> names = new Vector<>(4);
		System.out.println(names.size()); // number of elements
		System.out.println(names.capacity());
		names.add("vaishnavi");
		names.add("sagar");
		names.add("bhushan");
		names.add("pritish");

		System.out.println(names.size()); // number of elements
		System.out.println(names.capacity());

		names.add("omkar");
		System.out.println(names.size()); // number of elements
		System.out.println(names.capacity());

		Iterator list1 = names.iterator();
		while (list1.hasNext()) {

			System.out.println(list1.next());

		}

		Enumeration<String> en = names.elements();
		while (en.hasMoreElements()) {
			String s = en.nextElement();
			if (s.equals("omkar")) {

				names.remove("omkar");
			}
		}
		System.out.println(names);
	}
}
