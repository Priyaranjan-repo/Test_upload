package com.qa.test;

public class ReverseEach {

	public static void main(String[] args) {

		String input = "I am giving selenium Interview";
		String output = reverseEachWord(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);

	}

	public static String reverseEachWord(String s) {
		String[] word = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (String w : word) {
			StringBuilder reveseWord = new StringBuilder(w).reverse();
			sb.append(reveseWord).append(" ");
		}
		return sb.toString().trim();
	}
}
