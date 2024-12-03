package com.demoPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hbj {
	public static void main(String[] args) {
		int[] a = { 3, 1, 6, 7, 4 }; // Input array

		// Step 1: Sort the array
		Arrays.sort(a);

		// Step 2: Find missing numbers
		List<Integer> missingNumbers = new ArrayList<>();
		for (int i = a[0]; i <= a[a.length - 1]; i++) {
			boolean found = false;
			for (int num : a) {
				if (num == i) {
					found = true;
					break;
				}
			}
			if (!found) {
				missingNumbers.add(i);
			}
		}

		// Output the result
		System.out.println("Missing Numbers: " + missingNumbers);
	}
}
