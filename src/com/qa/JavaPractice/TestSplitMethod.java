package com.qa.JavaPractice;

public class TestSplitMethod {
	public static void main(String[] args) {

		String str = "Convert this string to array";
		String[] strArray = str.split(" "); // Split by space

		for (String s : strArray) {
			System.out.println(s);
		}
	}
}
