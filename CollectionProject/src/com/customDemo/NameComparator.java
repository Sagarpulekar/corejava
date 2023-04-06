package com.customDemo;

import java.util.Comparator;

class NameComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {

		return s1.getsName().compareTo(s2.getsName());
	}
}
