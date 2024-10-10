package com.qa.JavaPractice;

public class CountnumbersofWord {
	// public static void main(String[] args) {
	/*
	 * // String s = " rettet12 yi ioo98";
	 * 
	 * String sentence = "How many words are in this sentence?";
	 * 
	 * int wordCount = countWords(sentence); System.out.println("Number of words: "
	 * + wordCount); }
	 * 
	 * public static int countWords(String str) { if (str == null || str.isEmpty())
	 * { return 0; }
	 * 
	 * // Split the string by spaces (or any whitespace) String[] words =
	 * str.trim().split("\\s+");
	 * 
	 * // Return the number of words return words.length; }
	 * 
	 * }
	 */

///////////////////////////////////---------------------------------////////////////////
	public static void main(String[] args) {
		String sr = " Welcome to the java session ";
		System.out.println("Count Number of word :" + countWordsWithPunctuation(sr));

	}

	public static int countWordsWithPunctuation(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		// Remove punctuation
		str = str.replaceAll("[^a-zA-Z0-9\\s]", "");

		// Split by whitespace and count words
		String[] words = str.trim().split(" \\s+");
		return words.length;
	}
}