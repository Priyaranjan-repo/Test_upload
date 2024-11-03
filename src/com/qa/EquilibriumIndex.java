package com.qa;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };

		// Call the function to find the equilibrium index
		findEquilibriumIndex(arr);
	}

	public static void findEquilibriumIndex(int[] arr) {
		int totalSum = 0;
		int leftSum = 0;

		// Calculate the total sum of the array
		for (int num : arr) {
			totalSum += num;
		}

		// Traverse the array and calculate the equilibrium index
		for (int i = 0; i < arr.length; i++) {
			// Update totalSum by subtracting the current element
			totalSum -= arr[i];

			// If leftSum equals totalSum, the equilibrium index is found
			if (leftSum == totalSum) {
				System.out.println("Equilibrium index is: " + i);
			}

			// Update leftSum by adding the current element
			leftSum += arr[i];
		}
	}
}
