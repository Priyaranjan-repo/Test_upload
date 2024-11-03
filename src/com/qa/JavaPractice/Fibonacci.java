package com.qa.JavaPractice;

public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0, n2 = 1;
		int sum;

		System.out.print(n1 + "\t" + n2);

		for (int i = 0; i < 8; i++) {
			sum = n1 + n2;

			System.out.print("\t" + sum);
			int temp = n2;
			n2 = sum;
			n1 = temp;
		}
	}
}
