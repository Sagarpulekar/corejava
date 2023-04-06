package com.customDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Student1Test {
	public static void main(String[] args) {
		ArrayList<Student1> slist = new ArrayList<>();
		slist.add(new Student1(101, "Suyog", 23, 89f));
		slist.add(new Student1(102, "Vivek", 26, 78f));
		slist.add(new Student1(103, "Sagar", 22, 89f));
		slist.add(new Student1(104, "Aditya", 27, 67f));
		slist.add(new Student1(105, "Mamta", 26, 57f));

		for (Student1 s : slist) {
			System.out.println(s);
		}

		Collections.sort(slist, new NameComparator());

		for (Student1 s : slist) {
			System.out.println(s);
		}
	}
}
