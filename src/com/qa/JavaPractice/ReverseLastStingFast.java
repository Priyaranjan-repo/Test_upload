package com.qa.JavaPractice;

public class ReverseLastStingFast {

	public static void main(String[] args) {

		String s = "My name is sarat ranjan";

		String[] s1 = s.split(" ");

		String rev = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			rev += s1[i] + " ";
		}
		System.out.println(rev);

	}
}
