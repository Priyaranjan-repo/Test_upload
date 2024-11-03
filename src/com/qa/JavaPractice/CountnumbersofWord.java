package com.qa.JavaPractice;

public class CountnumbersofWord {

///////////////////////////////////---------------------------------////////////////////
	public static void main(String[] args) {
		String sr = "i 099$%&&#love7890 momos477788";
		System.out.println("Count Number of word :" + countWordsWithPunctuation(sr));

	}

	public static int countWordsWithPunctuation(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		// Remove punctuation
		str = str.replaceAll("[^a-zA-Z0-9]", "//s");
		str = str.replaceAll("[^0-9]", "");
		// replaceAll("[^a-zA-Z0-9\\s]", "");

		// Split by whitespace and count words
		String[] words = str.trim().split(" \\s+");
		return words.length;
	}
}