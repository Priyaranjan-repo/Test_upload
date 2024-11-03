package com.pattern;

public class NumberTrianglePattern {

	public static void main(String[] args) {
		int rows = 6; // Set the number of rows you want to print

		for (int i = 1; i <= rows; i++) {
			// Print leading spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Print repeated numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");// j for only 123..
											// i print for repaet nuber 1 12,123
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}

/*
 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6
 * 
 * 
 * 
 */
