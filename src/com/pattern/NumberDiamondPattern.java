package com.pattern;

public class NumberDiamondPattern {
	public static void main(String[] args) {
		int rows = 8; // Set the number of rows you want to print

		for (int i = 0; i < rows; i++) {
			// Print leading spaces
			for (int j = 1; j < rows - i; j++) {
				System.out.print("  ");
			}

			// Print ascending numbers
			for (int j = 9 - i; j <= 9; j++) {
				System.out.print(j + " ");
			}

			// Print descending numbers
			for (int j = 8; j >= 9 - i; j--) {
				System.out.print(j + " ");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}
