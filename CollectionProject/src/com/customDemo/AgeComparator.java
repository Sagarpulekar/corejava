package com.customDemo;

import java.util.Comparator;

class AgeComparator implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {

		if (s1.getsAge() == s2.getsAge())
			return 0;
		else if (s1.getsAge() > s2.getsAge())
			return 1;
		else
			return -1;
	}
}
