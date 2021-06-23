package com.aia.java.day5;

public class TestString {
	public static void main(String[] args) {
		//String literal
		String s1 = "welcome";
		String s2 = "welcome";
		
		System.out.println(s1 == s2);
		
		//String by new keyword
		String x = new String("welcome");
		String y = new String("welcome");
		System.out.println(x == y);
		System.out.println(x.equals(y));
		
	}
}
