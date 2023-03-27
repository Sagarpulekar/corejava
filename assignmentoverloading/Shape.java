package com.assignmentoverloading;

public class Shape {
	public float radius;
	public double side;
	public float length;
	public float breadth;

	public void draw(float radius) {
		this.radius = radius;

	}

	public void draw(double side) {
		this.side = side;

	}

	public void draw(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;

	}

	public void display() {
		System.out.println("Radius of Circle is " + radius);
		System.out.println("Side of Square is " + side);
		System.out.println("Length and breadth of rectangle are " + length + " " + breadth);
	}

}
