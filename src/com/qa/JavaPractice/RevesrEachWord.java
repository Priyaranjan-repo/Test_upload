package com.qa.JavaPractice;

public class RevesrEachWord {

	public static void main(String[] args) {

		String str = "Today is interview"; // weivretni si yadoT
		System.out.println(reverseMe(str));
	}

	public static String reverseMe(String s) {
		String reverse = " ";
		for (int i = 0; i < s.length(); i++) {
			reverse = s.charAt(i) + reverse;

		}
		return reverse;

	}
}
