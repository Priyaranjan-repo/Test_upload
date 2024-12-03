package com.demoPractice;

public class PallindromeString {

	public static void main(String[] args) {

		String s = "";
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter the string");
//       char c = sc.next().charAt(1);

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = s.charAt(i) + rev;
		}

		if (s.equals(rev)) {
			System.out.println("pallindrome number");
		} else {
			System.out.println("not pallindrome number");
		}

	}

}
