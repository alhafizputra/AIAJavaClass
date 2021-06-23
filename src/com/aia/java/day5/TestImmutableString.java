package com.aia.java.day5;

public class TestImmutableString {
	public static void main(String[] args) {
		String s = "Sachin ";
		s = s.concat("Tendulkar");
		System.out.println(s);
	}
}
