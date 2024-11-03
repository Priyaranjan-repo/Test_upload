package com.qa.JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {

		/*
		 * int[] a = { 1, 2, 3, 4, 5, 5, 66, 743, 23, 53, 1, 4, 5, 2, 4 };
		 * 
		 * int[] b = Arrays.stream(a).distinct().toArray();
		 * 
		 * System.out.println(Arrays.toString(a));
		 * 
		 * System.out.println(Arrays.toString(b));
		 */

//using hash set

//========================================
		int[] a = { 1, 2, 3, 4, 5, 5, 66, 743, 23, 53, 1, 4, 5, 2, 4 };

		Set<Integer> dup = new HashSet<Integer>();
		for (int i : a) {

			if (dup.add(i)) {
				System.out.print(" " + i);
			}

		}

	}

}
