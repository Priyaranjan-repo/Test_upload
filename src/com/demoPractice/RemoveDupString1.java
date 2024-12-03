package com.demoPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupString1 {

	public static void main(String[] args) {

		// output = jav
		String s = "java";

		System.out.println(removeDup(s));

	}

	public static String removeDup(String str) {

		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);// s

			if (!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}

		return sb.toString();
		// a= a+b // 3 5 =8
		// b =a-b; b=2
		// a = a-b 8-
		// temp = num1;
		// num1= num2;
		// num2 = temp;

	}
}
