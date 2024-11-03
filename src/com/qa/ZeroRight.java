package com.qa;

public class ZeroRight {

	public static void main(String[] args) {
		int arr[] = { 1, 7, 5, 0, 0, 4, 0, 2, 9, 0, 3, 12 };

		for (int g = 0; g < arr.length; g++) {

			System.out.print(" " + arr[g]);

			moveZero(arr);
		}
	}

	public static void moveZero(int[] arr) {
		int len = arr.length;
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < len) {
			arr[count++] = 0;

		}
		// return len;
	}
}
