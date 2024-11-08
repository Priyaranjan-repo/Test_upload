package com.qa;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String s1 = "CARE";
		String s2 = "RACEw";

		System.out.println("Both String are Anagram " + isAnagramSort(s1, s2));

	}

	public static boolean isAnagramSort(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char[] a1 = string1.toCharArray();
		char[] a2 = string2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}
}
