package com.qa;

public class ReverseeachWord {
	public static void main(String[] args) {
		String s = "Country Is India and Langauge are Good"; // Input string

		// yrtnuoC sI aidnI dna eguagnaL era dooG

		// String s = "yadot110si210ym310weivretni";
		String[] words = s.split(" ");

		String result = "";

		for (String s1 : words) {
			// Manually reverse each word
			String reverse = "";

			for (int i = s1.length() - 1; i >= 0; i--) {
				reverse += s1.charAt(i);
			}
			// Add the reversed word to the result
			result += reverse + " ";

		}

		System.out.println(result);
	}
}
