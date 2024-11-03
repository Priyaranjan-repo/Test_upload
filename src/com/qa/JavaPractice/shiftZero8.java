package com.qa.JavaPractice;

import java.util.Arrays;

public class shiftZero8 {

	public static void main(String[] args) {

		int arr[] = { 1, 7, 5, 0, 0, 4, 0, 2, 9, 0, 3, 12 };

		System.out.println(Arrays.toString(arr));

		for (int n = 0; n < arr.length; n++) {

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == 0) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
