package com.pattern;

public class InvertedStarPyramid {
	public static void main(String[] args) {
		int rows = 7; // Set the number of rows you want to print

		for (int i = 0; i < rows; i++) {
			// Print leading spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// Print asterisks with spaces
			for (int j = 0; j < rows - i; j++) {
				System.out.print(j + " ");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}

/*
 * 
 * * * * * * * * * * * * * * * * * * * * * *
 * 
 * 
 * 
 * 
 */