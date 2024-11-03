package com.pattern;

public class NumberInvertedPyramid {
	public static void main(String[] args) {
		int rows = 9; // Set the number of rows you want to print, starting from 9

		for (int i = 0; i < rows; i++) {
			// Print leading spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// Print repeated numbers
			for (int j = 0; j < rows - i; j++) {
				System.out.print((rows - i) + " ");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}

/*
 * 9 9 9 9 9 9 9 9 9 8 8 8 8 8 8 8 8 7 7 7 7 7 7 7 6 6 6 6 6 6 5 5 5 5 5 4 4 4 4
 * 3 3 3 2 2 1
 * 
 * 
 * 
 * 
 * 
 * 
 */