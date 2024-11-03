package com.qa;

import java.util.HashMap;
import java.util.Map;

public class NoOfEntryString {

	public static void main(String[] args) {

		// String str = "MyInterviewis Tomoorow";
		String str = "Welcome to Selemium Interview";
		countCharFreq(str);

	}

	public static void countCharFreq(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] word = str.toCharArray();

		for (char ch : word) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Repeating chararcter is :" + entry.getKey() + " - " + entry.getValue() + " times");
		}

	}

}
