package com.softwaretestingo.javaprograms;

import java.util.Arrays;

public class Program21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Input:[5, 0, 4, 6, 0, 7, 0]
		 *
		 * Output: 0 0 0 5 4 6 7
		 */
		int[] a = { 5, 0, 4, 6, 0, 7, 0 };

		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] != 0) {

					int b = a[j + 1];  // u can strore any variable like temp,c,

					a[j + 1] = a[j];

					a[j] = b;

				}
			}
		}

		System.out.println(Arrays.toString(a));
	}
}
