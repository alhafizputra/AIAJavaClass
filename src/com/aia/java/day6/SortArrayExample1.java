package com.aia.java.day6;

import java.util.Arrays;

public class SortArrayExample1 {
	public static void main(String[] args) {
		int[] array = new int[] { 90, 23, 5, 75, -4, 46, 97 };
		
		Arrays.sort(array);
		
		for(int i: array) {
			System.out.println(i);
		}
	}
}
