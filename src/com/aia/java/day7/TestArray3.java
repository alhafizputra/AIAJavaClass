package com.aia.java.day7;

public class TestArray3 {
	public static void main(String[] args) {
		int n = 9;
		int nt = (n - 1) / 2;
		int angkaGanjil = 1;
		int angkaGanjilb = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print(angkaGanjil + "\t");
				} else if (i == nt) {
					System.out.print(angkaGanjil + "\t");
				} else {
					System.out.print("\t");
				}
				if (j == nt) {
					System.out.print(angkaGanjilb + "\t");
				}
				angkaGanjil += 2;

			}
			angkaGanjilb += 2;
			angkaGanjil = 1;
			System.out.println();
		}
	}
}
