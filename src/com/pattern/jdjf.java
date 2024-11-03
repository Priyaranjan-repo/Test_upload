package com.pattern;

public class jdjf {

	public static void main(String[] args) {

		int rows = 6;

		for (int i = 1; i <= rows; i++) {

			// leading space
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "");

			}
			System.out.println();
		}

	}
}
