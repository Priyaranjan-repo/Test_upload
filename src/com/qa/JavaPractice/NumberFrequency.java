package com.qa.JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {

	public static void main(String[] args) {
		int x[] = { 1, 3, 6, 7, 6, 8, 9, 7, 6, 43, 2 };

		// Call the method to count frequencies and print the result
		printNumberFrequencies(x);
	}

	public static void printNumberFrequencies(int[] array) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : array) {

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {

				map.put(num, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
		}
	}
}
