package com.demoPractice;

import java.util.Arrays;

public class missingNoArray {
	
	
	//public static void main(String[] args) {
		//int a[]= {3,1,6,7,4};
//		
//		int missingNo = getNumber(a, 6);
//		System.out.printf(Arrays.toString(a),missingNo);
//	}
//	
//	public static int getNumber(int[] array,int n) {
//		int actualSum=0;
//		int expectedSum=(n*(n+1)/2);
//		
//		for(int i :array) {
//			actualSum = actualSum+i;
//		}
//		return expectedSum -actualSum;
//	}

		

	    public static void main(String[] args) {
	        int[] a = {3, 1, 6, 7, 5}; // Input array
	        Arrays.sort(a); // Sort the array to ensure the range is clear
	        int n = a[a.length - 1]; // Get the maximum number in the array dynamically

	        // Step 1: Calculate the expected sum of numbers from 1 to n
	        int expectedSum = n * (n + 1) / 2;

	        // Step 2: Calculate the actual sum of elements in the array
	        int actualSum = 0;
	        for (int num : a) {
	            actualSum += num;
	        }

	        // Step 3: Find the missing number
	        int missingNumber = expectedSum - actualSum;

	        // Output the result
	        System.out.println("Missing Number: " + missingNumber);
	    }
	}


