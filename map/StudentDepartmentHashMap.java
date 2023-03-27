package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentDepartmentHashMap {

	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student(1, "Sagar"));
		list1.add(new Student(2, "Rohit"));
		list1.add(new Student(3, "Vivek"));
		list1.add(new Student(4, "Gaurav"));

		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student(5, "Priya"));
		list2.add(new Student(6, "Vaishnavi"));
		list2.add(new Student(7, "Rupali"));
		list2.add(new Student(8, "Shruuti"));
		HashMap<Department, ArrayList<Student>> hm = new HashMap<>();
		hm.put(new Department(101, "IT"), list1);
		hm.put(new Department(102, "marketing"), list2);
		for (Map.Entry<Department, ArrayList<Student>> en : hm.entrySet()) {
			System.out.println(en.getKey() + "" + en.getValue());
		}
	}
}
