package com.qa;

public class LargestValueFromArray {
	public static void main(String[] args) {
		int[] arr = { 12, 13, 42, 52, 42, 546, 632, 1 };
		int max = arr[0];

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			} else if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("Max :" + max);
		System.out.println("Min :" + min);
	}
}