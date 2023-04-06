package com.demo;

import java.util.Scanner;

public class Moviehall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Movie m1 = new Movie(101, "Titanic", 1994);
		Theatre t1 = new Theatre(5152, "INOX", "PUNE", m1);
		Theatre t2 = new Theatre(5512, "cinepolis", "PUNE");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("Enter the Theatre:-");
		t1.setLocation(sc.next());
		System.out.println("Enter movie name:-");
		m1.setMovieName(sc.next());
		System.out.println(m1);
		System.out.println(t1);
		System.out.println("No of Movie in theatre:-" + Movie.Moviecount);

	}

}
