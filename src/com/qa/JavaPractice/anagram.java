package com.qa.JavaPractice;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {

		String s1 = "CARE";
		String s2 = "race";

		System.out.println("Both string are Anagram " + anagramdemo(s1, s2));
	}

	public static boolean anagramdemo(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		} else {

			char[] c1 = s1.toUpperCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);

		}
	}

}
