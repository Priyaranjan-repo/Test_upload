package com.pattern;

public class pyarmid {

	public static void main(String[] args) {

		int rows = 5; // Number of rows for the triangle

		for (int i = 1; i <= rows; i++) { // Outer loop for each row

			for (int j = 1; j <= i; j++) { // Inner loop to print stars

				System.out.print(j); // Print star

			}

			System.out.println(); // Move to the next line after each row

		}
	}

}

//1
/*
 * 12 123 1234 12345
 */
//