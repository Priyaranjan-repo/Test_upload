package JAVAPROGRAM;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows for the reverse pyramid: ");
		int numRows = sc.nextInt();

		printReversePyramid(numRows);

		sc.close();
	}

	public static void printReversePyramid(int numRows) {
		for (int i = numRows; i >= 1; i--) {
			// Print spaces
			for (int j = 0; j < numRows - i; j++) {
				System.out.print(" ");
			}

			// Print stars
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			// Move to the next line
			System.out.println();
		}
	}
}
