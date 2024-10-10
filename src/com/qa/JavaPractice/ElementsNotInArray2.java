package com.qa.JavaPractice;

import java.util.HashSet;

public class ElementsNotInArray2 {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 3, 4, 5, 6, 7 };

		// Elements in array1 not in array2: 1 2

		findElementsNotInArray2(array1, array2);
	}

	public static void findElementsNotInArray2(int[] array1, int[] array2) {
		// Store elements of array2 in a HashSet
		HashSet<Integer> set = new HashSet<>();

		for (int num : array2) {
			set.add(num);
		}
		System.out.println("Elements in array1 not in array2:");
		for (int num : array1) {
			if (!set.contains(num)) {
				System.out.print(num + " ");
			}
		}
	}
}
