package com.aia.java.day6;

public class SortArrayExample2 {
	public static void main(String[] args) {
		// creating an instance of an array
		int[] arr = new int[] { 78, 34, 1, 3};
		System.out.println("Array elements after sorting:");
		// sorting logic
		for (int i = 0; i < arr.length; i++) {
			System.out.println("==indeks ke " + i);
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println("compare arr indeks ke " + i + " dengan " + j);
				System.out.println("arr["+i+"] = " + arr[i]);
				System.out.println("arr["+j+"] = " + arr[j]);
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					System.out.println("tmp= " + tmp);
					arr[i] = arr[j];
					System.out.println("arr["+i+"]= " + arr[i]);
					arr[j] = tmp;
					System.out.println("arr["+j+"]= " + arr[j]);
					//loop 1 => { 34, 78, 1, 3};
				}
				System.out.println("loop "+ j +" arr["+i+"]= " + arr[i]);
			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
	}
	//[1, 2, 3, 4], shifting arr sebanyak n
	//n=2
	//[3, 4, 1, 2]
	
	//KATAK
}
