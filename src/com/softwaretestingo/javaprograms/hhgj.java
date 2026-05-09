package com.softwaretestingo.javaprograms;

public class hhgj {

	// {5,8,3,9,2,7,4} right shift the array with 3
	// Output – {9,2,7,4,5,8,3}

	public static void main(String[] args) {

		int[] arr = { 5, 8, 3, 9, 2, 7, 4 };

		for (int i = 0; i < arr.length; i++) {

			if (i<= arr.length / 2) {
				
				System.out.print(" "+ arr[arr.length/2 + i]);
			} else {
				System.out.print(" " + arr[arr.length / 2 - arr.length + i]);
			}
		}
	}
}
