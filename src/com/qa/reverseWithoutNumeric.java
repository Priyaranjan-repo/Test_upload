package com.qa;

public class reverseWithoutNumeric {

	public static void main(String[] args) {
		String input = "today110is210my310interview";

		// Output: yadot110si210ym310weivretni

		// Call the method to reverse the words
		String result = reverseWordsManually(input);
		System.out.println("Output: " + result);
	}

	public static String reverseWordsManually(String str) {
		// Variables to store the current alphabetic and numeric parts
		String alphabets = "";
		String numbers = "";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// Check if the character is a digit
			if (Character.isDigit(ch)) {
				numbers += ch;
			} else {
				// If numbers are collected, reverse the alphabets and append to result
				if (!numbers.isEmpty()) {
					result += reverseString(alphabets) + numbers;
					alphabets = ""; // Reset the alphabets
					numbers = ""; // Reset the numbers
				}
				alphabets += ch; // Collect the alphabetic characters
			}
		}

		// Add the last part (final reversed word and numbers)
		result += reverseString(alphabets) + numbers;

		return result;
	}

	// Custom method to reverse a string manually
	public static String reverseString(String str) {
		char[] reversed = new char[str.length()];
		int len = str.length();

		for (int i = 0; i < len; i++) {
			reversed[i] = str.charAt(len - 1 - i); // Reverse the string manually
		}

		return new String(reversed);
	}
}
