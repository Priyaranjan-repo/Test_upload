package com.qa.JavaPractice;

public class ReveseArray {

	public static void main(String[] args) {
		int x[] = { 1, 4, 989, 738, 8902 }; // Example array

		printArrayInReverse(x);
	}

	public static void printArrayInReverse(int[] n) {

		for (int i = n.length - 1; i >= 0; i--) {
			System.out.print(n[i]);

			// Add a space between numbers for readability, except after the last number
			// if (i > 0) {
			System.out.print(" ");
		}
	}
}
