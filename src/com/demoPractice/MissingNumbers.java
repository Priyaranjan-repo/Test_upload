package com.demoPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers {
	
	    public static void main(String[] args) {
	       // int[] a = {3, 1, 6, 7, 4}; // Input array

	        int[] a = {1, 2, 3, 4, 7};
	        // Step 1: Sort the array
	        Arrays.sort(a);

	        // Step 2: Find missing numbers
	        List<Integer> missingNumbers = new ArrayList<>();
	        for (int i = a[0]; i <= a[a.length - 1]; i++) {
	            if (!contains(a, i)) {
	                missingNumbers.add(i);
	            }
	        }

	        // Output the result
	        System.out.println("Missing Numbers: " + missingNumbers);
	    }

	    // Helper method to check if a number exists in the array
	    private static boolean contains(int[] arr, int key) {
	        for (int num : arr) {
	            if (num == key) {
	                return true;
	            }
	        }
	        return false;
	    }
	}
