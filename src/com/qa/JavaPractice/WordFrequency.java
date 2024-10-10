package com.qa.JavaPractice;

import java.util.HashMap;

public class WordFrequency {

	public static void main(String[] args) {
		String str = "Convert @#this 2string to array 50998  Convert this string";

		// Call the method to count word frequencies
		countWordFrequency(str);
	}

	public static void countWordFrequency(String str) {
		// Create a HashMap to store the frequency of each word
		HashMap<String, Integer> frequencyMap = new HashMap<>();

		// Split the string into words (using space as the delimiter)
		String[] words = str.split("\\d+");
		// String[] digits = str.split("[a-zA-Z0-9]");

		// Loop through each word
		for (String word : words) {
			word = word.toLowerCase(); // Convert to lowercase to avoid case mismatch

			// If the word is already in the map, increment its count
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}

		// Print the frequency of each word
		System.out.println("Word Frequencies:");
		for (HashMap.Entry<String, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
		}
	}
}
