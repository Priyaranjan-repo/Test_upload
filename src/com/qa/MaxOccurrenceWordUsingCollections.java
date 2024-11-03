package com.qa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxOccurrenceWordUsingCollections {
	public static void main(String[] args) {
		// Input string
		String input = "I am am giving my selenium interview interview interview";

		// Split the string into words using inbuilt function split()
		String[] words = input.split(" ");

		// Create a HashMap to store the word counts
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Count occurrences of each word
		for (String word : words) {
			wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		}

		// Find the word with the maximum occurrence using Collections.max
		String maxWord = Collections.max(wordCountMap.entrySet(), Map.Entry.comparingByValue()).getKey();

		// Print the word with the maximum occurrence and its count
		System.out.println("The word with the maximum occurrence is: " + maxWord + " (occurred "
				+ wordCountMap.get(maxWord) + " times)");
	}
}
