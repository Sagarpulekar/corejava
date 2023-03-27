package com.assignmentstring;

public class CompareString {

	public static void main(String[] args) {
		String s1 = "sagar";
		String s2 = "sagar";
		String s3 = "java";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		System.out.println("------------------");
		String s4 = new String("sagar");
		String s5 = new String("sagar");
		String s6 = new String("java");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));

	}

}
