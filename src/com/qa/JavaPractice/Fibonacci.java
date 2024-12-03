package com.qa.JavaPractice;

public class Fibonacci {

	public static void main(String[] args) {

		int firstNum = 0;
		int SecondNum = 1;
		int n = 10;

		System.out.println("fibonnaic series" + n + "terms");
		
		for (int i = 1; i <= n; i++) {

			System.out.print(firstNum + " ");

			int temp = firstNum+ SecondNum;
			firstNum = SecondNum;
			SecondNum = temp;

	}
	}
}
