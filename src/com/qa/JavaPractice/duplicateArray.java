package com.qa.JavaPractice;

public class duplicateArray {

//duplicate element in array

	public static void main(String[] args) {
		int[] my_array = { 1, 2, 5, 6, 87, 5, 87, 78, 6, 6, 7, 2 };

		duplicateArray(my_array);

	}

	public static void duplicateArray(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if ((arr[i] == arr[j]) && (i != j)) {

					System.out.println("duplicate number :" + arr[j]);
				}
			}
		}
	}
}
