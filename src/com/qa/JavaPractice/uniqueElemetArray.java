package com.qa.JavaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class uniqueElemetArray {

	public static void main(String[] args) {
		// Sample arrays
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 3, 4, 5, 6, 7 };

		// Convert arrays to sets to remove duplicates
		Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));

		// Create a copy of set1 to preserve the original set for further use
		Set<Integer> uniqueElements = new HashSet<>(set1);

		// Find the unique elements in set2 and remove them from uniqueElements
		uniqueElements.removeAll(set2);

		// The unique elements between the two arrays are now in uniqueElements
		System.out.println("Unique Elements: " + uniqueElements);
	}

}
