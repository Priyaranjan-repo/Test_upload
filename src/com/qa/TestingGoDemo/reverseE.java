package com.qa.TestingGoDemo;

public class reverseE {

	/*
	 * Input: he is a good boy
	 *
	 * 
	 * * Output: eh si a doog yob
	 */

	public static void main(String[] args) {

		String ip = "he is a good boy";
		String word[] = ip.split(" ");

		for (String ss : word) {
			System.out.print(revesePrg(ss) + " ");

		}

	}

    static String revesePrg(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {

			rev = str.charAt(i) + rev ;
		}
		return rev;
	}

}