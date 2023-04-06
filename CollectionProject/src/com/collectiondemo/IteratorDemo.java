package com.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("sagar");
		list.add("bhushan");
		list.add("pritish");
		list.add("uday");
		list.add("chinmay");
		System.out.println(list);
		/*
		 * Iterator<String> itr = list.iterator(); while (itr.hasNext()) { String s =
		 * itr.next(); System.out.println(s); }
		 */
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.equals("chinmay")) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}
