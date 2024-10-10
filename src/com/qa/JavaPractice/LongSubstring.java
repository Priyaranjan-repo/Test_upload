package com.qa.JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class LongSubstring {

	public static String longestUniqueSubstring(String str) {

		Map<Character, Integer> visited = new HashMap<>();
		String longestSubstring = "";
		int start = 0;

		for (int end = 0; end < str.length(); end++) {
			char currentChar = str.charAt(end);

			if (visited.containsKey(currentChar)) {
				start = Math.max(visited.get(currentChar) + 1, start);
			}

			if (longestSubstring.length() < end - start + 1) {
				longestSubstring = str.substring(start, end + 1);
			}

			visited.put(currentChar, end);
		}

		return longestSubstring;
	}

	public static void main(String[] args) {
		String s1 = "abcddeaabcc";
		System.out.println("The input string is: " + s1);
		String result = longestUniqueSubstring(s1);
		System.out.println("The longest substring without" + " repeating characters is: " + result);

	}
}
