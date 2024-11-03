package com.pattern;

public class StarPyramid {
	public static void main(String[] args) {

		int rows = 7; // Set the number of rows you want to print

		for (int i = 1; i <= rows; i++) {
			// Print leading spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Print asterisks with spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}

//     *                 1
/*
 * 22 333 4444 55555 666666 7777777
 */

//   * * 
/// * * * 
// * * * * 
// * * * * *
