package com.qa.JavaDemoPrg;

import java.util.Arrays;

public class PrintArraytypes {

	public static void main(String[] args) {

		String[] colors = { "blue", "ultra", "red", "black" };
		int arr[] = { 4, 5, 3, 2, 7, 6 };

		for (int i = 0; i < colors.length; i++) {

			System.out.println(colors[i]);

		}

		System.out.println("using  as list =====================");

		for (String string : colors) {

			System.out.println(Arrays.asList(string));

		}
		System.out.println("using   as list int array =====================");
		for (Integer in : arr) {
			System.out.print(Arrays.asList(in));

		}

		System.out.println("using tostring" + Arrays.toString(colors));
	}
}
