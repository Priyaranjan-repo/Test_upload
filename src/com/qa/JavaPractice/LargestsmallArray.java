package com.qa.JavaPractice;

public class LargestsmallArray {

	public static void main(String[] args) {

		int nums[] = { 8987, 4, 59, 65, 34, 98 };

		int largest = nums[0];
		int smallest = nums[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i]  largest) {
				largest = nums[i];
			} else if (nums[i] < smallest) {
				smallest = nums[i];

			}
		}

		System.out.println("largest num is " + largest);
		System.out.println("smallest num is " + smallest);

	}
}