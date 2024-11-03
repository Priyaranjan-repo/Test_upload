package com.qa.JavaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;

// find common element in between two common array

public class CommonElementsInArrays {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3, 4, 5 };
		int array2[] = { 3, 4, 5, 2, 8 };

		findCommonElements(array1, array2);
	}

	public static void findCommonElements(int[] array1, int[] array2) {
		// Using HashSet to store common elements
		HashSet<Integer> set = new LinkedHashSet<>();

		// Add elements from the first array to the set
		for (int num : array1) {
			set.add(num);
		}

		System.out.println("Common elements:");
		// Loop through the second array and print the common elements
		for (int common : array2) {
			if (set.contains(common)) {
				System.out.print(common + " ");
			}
		}
	}
}

/*
 * import java.util.Arrays;
 * 
 * public class MergeArrays {
 * 
 * public static void main(String[] args) { int array1[] = { 1, 2, 3, 4, 5 };
 * int array2[] = { 3, 4, 5, 6, 7 };
 * 
 * int[] mergedArray = mergeArrays(array1, array2);
 * 
 * System.out.println("Merged array: " + Arrays.toString(mergedArray)); }
 * 
 * public static int[] mergeArrays(int[] array1, int[] array2) { // Create a new
 * array large enough to hold both arrays int[] mergedArray = new
 * int[array1.length + array2.length];
 * 
 * // Copy the first array to the new array System.arraycopy(array1, 0,
 * mergedArray, 0, array1.length);
 * 
 * // Copy the second array to the new array System.arraycopy(array2, 0,
 * mergedArray, array1.length, array2.length);
 * 
 * return mergedArray; } }
 */