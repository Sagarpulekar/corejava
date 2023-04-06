package com.vectordemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v); // null size
		System.out.println(v.capacity());// default capacity
		v.add(50);
		v.add(345);
		v.add(54);
		v.add(1, 75);
		v.add(11);
		v.add(62);
		v.add(65);
		v.add(95);
		v.add(788);
		v.add(6532);
		v.add(586);

		System.out.println(v);
		System.out.println(v.capacity());
		for (int i = 0; i < v.size(); i++) {
			if (i == 3) {
				System.out.println("removal of element:-" + v.elementAt(i));

			}
		}
		System.out.println(v);
		System.out.println("*************");
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("/////////////////////");
		Iterator itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
