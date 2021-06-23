package com.aia.java.day3;

public class Main {
	public static void main(String[] args) {
//		Animal animal = new Animal();
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		
		//Shape
		Shape rectangle = new Rectangle();
		rectangle.draw();
		Circle circle = new Circle();
		circle.draw();
	}
}
