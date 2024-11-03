package com.qa.JavaPractice;

public class PalindromeCheck {
	public static void main(String[] args) {

		// enter string
		// find the reverses
		// check original and revesrse string are equal or not
		// if equal struing are pallindrome

		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter a string:");
		// String str = scanner.nextLine();

		String rev = "";
		String s = "MOM";
		int length = s.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (s.equals(rev)) {
			System.out.println(s + " is a palindrome.");
		} else {
			System.out.println(s + " is not a palindrome.");
		}
	}
}
