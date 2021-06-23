package com.aia.java.day7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestArraySet {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		System.out.println(names.add("Hari"));
		names.add("Darwin");
		names.add("Kevin");
		System.out.println(names.add("Hari"));
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
