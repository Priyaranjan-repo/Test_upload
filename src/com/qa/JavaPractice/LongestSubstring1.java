package com.qa.JavaPractice;

import java.util.HashSet;

public class LongestSubstring1 {

	public static void main(String[] args) {

		String s1 = "abacabccbde";
		System.out.println(Longest(s1));
	}

	public static String Longest(String str) {

		String longtillnow = "";

		String longoverrall = " ";

		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (set.contains(c)) {
				longtillnow = " ";
				set.clear();
			}
			set.add(c);
			longtillnow += c;

			if (longtillnow.length() > longoverrall.length()) {
				longoverrall = longtillnow;
			}

		}
		return longoverrall;

	}

}
