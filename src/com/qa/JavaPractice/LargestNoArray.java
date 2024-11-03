package com.qa.JavaPractice;

public class LargestNoArray {

	public static void main(String[] args) {

		int x[] = { 1, 7774, 989, 738, 8902 }; // Example array

		int greatest = findGreatestNumber(x);
		System.out.println("The greatest number in the array is: " + greatest);
	}

	public static int findGreatestNumber(int[] array) {
		// Initialize the greatest number as the first element of the array
		int max = array[0];

		for (int i = 1; i < array.length; i++) {

			// If the current element is greater than the max, update max
			if (array[i] > max) {
				max = array[i];
			}
		}

		// Return the greatest number found
		return max;
	}

}

//"" +ar[j]
//aar(srr)