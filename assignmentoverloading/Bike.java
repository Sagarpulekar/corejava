package com.assignmentoverloading;

public class Bike {
	public String colour;
	public float speed;

	public void bikeinfo(String colour, float speed) {
		this.colour = colour;
		this.speed = speed;
	}

	public void display() {
		System.out.println("Bike Colour" + colour + "Speed of Bike is" + speed + "km/hr");
	}
}
