package com.stackdemo;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.push("sagar");
		stk.push("bhushan");
		stk.push("pritish");
		stk.push("omkar");
		stk.push("chinmay");
		System.out.println(stk);
		System.out.println(stk.peek());// retrieve element at last
		System.out.println(stk);
		System.out.println(stk.pop());// retrieve and remove
		System.out.println(stk);
		System.out.println(stk.search("bhushan"));// returns distance from top
		System.out.println(stk.search("aditya")); // if not found returns -1
		Enumeration<String> en = stk.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
