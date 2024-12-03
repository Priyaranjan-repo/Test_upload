package com.qa.TestingGoDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDup {

	public static void main(String[] args) {

		String str = "priyaranjan";

		Set<Character> set = new LinkedHashSet<Character>();

		StringBuffer sb = new StringBuffer();

		for (int j = 0; j < str.length(); j++) {

			Character ch = str.charAt(j);// p
			if (!set.contains(ch)) { // is s is not in set
				set.add(ch); // add to set
				sb.append(ch); // s to sring bufeer

			}

		}
		System.out.println(sb.toString());

	}
}
