package com.assignmentoverloading;

public class circle extends Shape {

	public static void main(String[] args) {
		Shape c = new Shape();
		c.draw(25.25f);
		System.out.println("Radius of Circle is" + c.radius);
		c.draw(125.45);
		System.out.println("Side of Square is " + c.side);
		c.draw(145.25f, 100.20f);
		System.out.println("Length and breadth of rectangle are " + c.length + "and" + c.breadth);
	}
}
