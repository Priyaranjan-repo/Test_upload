package com.qa.JavaPractice;

import java.util.Arrays;

public class shiftZero8{

	public static void main(String[] args) {

		int arr[] = { 1, 7, 5, 0, 0, 4, 0, 2, 9, 0, 3, 12 };

		System.out.println(Arrays.toString(arr));

		for (int n = 0; n < arr.length; n++) {

			for (int j = 0; j < arr.length - 1; j++) {
				
				if (arr[j] == 0) {
				
					int b = arr[j + 1];
					arr[j + 1] = arr[n];
					arr[j] = b;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
