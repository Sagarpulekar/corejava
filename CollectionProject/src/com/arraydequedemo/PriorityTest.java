package com.arraydequedemo;

import java.util.ArrayDeque;
import java.util.Deque;

import com.queuedemo.Book;

public class PriorityTest {

		public static void main(String[] args) {
			Deque<Book> s = new ArrayDeque<>();
			Book b1 = new Book(101, "abc", "xyz", "aaa");
			Book b2 = new Book(102, "xyz", "abc", "bbb");
			s.add(b1);
			s.add(b2);
			System.out.println(b1);
			System.out.println(b2);
		}



	}

}
