package com.qa.JavaPractice;

public class ShiftZero {

	public static void main(String[] args) {
		int z[] = { 1, 7, 5, 0, 0, 4, 0, 2, 9, 0, 3, 12 };

		System.out.println("After shift zeros at end");
		for (int i = 0; i < z.length; i++) {
			System.out.print(" " + z[i]);
			moveZero(z);
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
		// for (int j = 0; j < len; j++) {
		// System.out.print(" " + arr[j]);
	}

}
