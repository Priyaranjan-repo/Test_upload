package com.qa.test;

import java.util.HashSet;
import java.util.Set;

public class Substring {

	public static void main(String[] args) {
		String f = "abbacde";
		Longest(f);
	}

	public static String Longest(String s) {

		Set<Character> set = new HashSet<Character>();

		String longesttillnow = "";
		String logestOverall = " ";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (set.contains(c)) {
				longesttillnow = " ";
				set.clear();

			} else {
				set.add(c);
				longesttillnow += c;

				if (longesttillnow.length() > logestOverall.length()) {
					logestOverall = longesttillnow;
				}
			}

			return logestOverall;

		}

	}
}
