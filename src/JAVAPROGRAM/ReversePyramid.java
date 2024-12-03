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

	public static void printReversePyramid(int Rows) {

		for (int i = 0; i < Rows; i++) {
			// Print spaces

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// Print stars

			for (int j = 0; j < Rows - i; j++) {

				System.out.print(" *");
			}

			// Move to the next line
			System.out.println();
		}
	}
}
