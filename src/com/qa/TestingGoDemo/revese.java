package com.qa.TestingGoDemo;

public class revese {

	public static void main(String[] args) {

		String s = "Banktyyu SBi";
		System.out.println(reverseMe(s));

	}

	private static String reverseMe(String s) {
		// TODO Auto-generated method stub
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}
}