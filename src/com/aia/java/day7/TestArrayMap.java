package com.aia.java.day7;

import java.util.HashMap;
import java.util.Map;

public class TestArrayMap {
	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<Integer, String>();
		names.put(1, "Hari");
		names.put(2, "Darwin");
		names.put(10, "Kevin");
		
//		for (Map.Entry name: names.entrySet()) {
//			System.out.println(name.getKey() + " " + name.getValue());
//		}
		
		System.out.println(names.get(10));
		names.put(3, "Rahmat");
		names.put(2, "Fikri");
		names.put(6, "Fikri");
		for (Map.Entry name: names.entrySet()) {
			System.out.println(name.getKey() + " " + name.getValue());
		}
	}
}
