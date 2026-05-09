package pattern_prog;

import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows for the top pyramid: ");
		int n = sc.nextInt();
		sc.close();

		// Printing the upper pyramid
		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Printing the lower inverted pyramid
		for (int i = n - 1; i >= 1; i--) {
			// Print spaces
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
