package com.qa.JavaPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySet {

	public static void main(String[] args) {
		String a[] = { "a", "b", "c", "a" };
		Set<String> set = new HashSet<String>(Arrays.asList(a));

		System.out.print("Set :" + set);
	}
}

// System.out.println("------------------------------------------------");

/*
 * String[] array = { "a", "b", "c" }; Set<String> set = new
 * HashSet<>(Arrays.stream(array).collect(Collectors.toSet()));
 * 
 * System.out.println("Set: " + set);
 * 
 * } }
 */

/*
 * public static void main(String[] args) {
 * 
 * String[] array = {"a", "b", "c"}; Set<String> set = new
 * HashSet<>(Arrays.asList(array));
 * 
 * System.out.println("Set: " + set); }
 */
//convert array number  to set 
/*
 * int arr[] = { 1, 2, 1, 3, 4, 5, 5, 66, 5, 743, 3, 23 };
 * 
 * Set<Integer> set1 = new HashSet<Integer>(); for(int i = 0;i<arr.length;i++) {
 * if(!set1.add(arr[i])) {
 * 
 * System.out.println("duplicate number :" + arr[i]);
 * 
 * }
 * 
 * } }}
 */
//----------------------------------