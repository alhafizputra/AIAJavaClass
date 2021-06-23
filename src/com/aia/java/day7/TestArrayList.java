package com.aia.java.day7;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Hari");
		names.add("Darwin");
		names.add("Kevin");
		names.add("Darwin");
			
		for(String name : names) {
			System.out.println(name);
		}
//		System.out.println(names.get(1));
	}
}
