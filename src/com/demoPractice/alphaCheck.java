package com.demoPractice;

import java.util.Scanner;

public class alphaCheck {

	public static void main(String[] args) {

		// a -z ,A-Z
		// String str ="tree";
		System.out.println("Enter a character ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("the given char is alphabet");
		} else {
			System.out.println("not alphabet");
		}

	}

}
