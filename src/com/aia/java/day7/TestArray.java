package com.aia.java.day7;

public class TestArray {
	public static void main(String[] args) {
		int n = 9;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
