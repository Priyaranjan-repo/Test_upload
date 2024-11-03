package com.qa.JavaPractice;

public class PrimeNo1To100 {
	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + "\t");
			}
		}
	}

	public static boolean isPrime(int n) {
		boolean isPrime = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				isPrime = false;
				break;
			}

			continue;

		}

		return isPrime;
	}
}
