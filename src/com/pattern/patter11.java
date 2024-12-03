package com.pattern;

public class patter11 {

	// 12345 5 1 to 5 (j) incre
	// 1234 4 1 to 4
	// 123 3
	// 12
	// 1

	public static void main(String[] args) {

		for (int i = 5; i > 0; i--) { // 5 4 3 2

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
