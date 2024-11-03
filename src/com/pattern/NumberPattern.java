package com.pattern;

public class NumberPattern {

	public static void main(String[] args) {
		int rows = 8; // Set the number of rows you want to print

		for (int i = 1; i <= rows; i++) {

			// Print leading spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}

			// Print ascending numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			// Print descending numbers

			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}

//  1 2 1 
//1 2 3 2 1 
//1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1
