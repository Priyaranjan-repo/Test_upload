package com.demoPractice;

public class PrimeNo {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			isPrime(i);
			System.out.print(i + "\t");
		}

	}

	public static boolean isPrime(int n) {

		boolean isPrime = true;
		for (int i = 0; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;

			}
		}

		isPrime = false;

		return isPrime;
	}
}
