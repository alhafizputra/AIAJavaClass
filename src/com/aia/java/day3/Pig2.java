package com.aia.java.day3;

public class Pig2 implements AnimalInterface, Animal2Interface {
	Pig2() {
		System.out.println("Pig 2 Created");
	}

	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");

	}

	@Override
	public void sleep() {
		System.out.println("Zzz");
	}

	@Override
	public void run() {
		System.out.println("Run..");
	}

}
