package com.qa.JavaPractice;

public class LeastNumberInArray {

	public static void main(String[] args) {
		int x[] = { 31, 4, 2, 9, 2738, 8902 }; // Example array

		int least = findLeastNumber(x);
		System.out.println("The least number in the array is: " + least);
	}

	public static int findLeastNumber(int[] array) {
		// Initialize the least number as the first element of the array
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			// If the current element is less than the min, update min
			if (array[i] < min) {
				min = array[i];
			}
		}

		// Return the least number found
		return min;
	}

}
//System.out.println(3+6+" is the sum.");