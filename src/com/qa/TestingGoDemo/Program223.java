package com.qa.TestingGoDemo;

public class Program223 {
	// int arr[] = { 92, 7, 12, 9, 8, 3 };
	// 3 8 9 12 92
	public static void main(String[] args) {

		int num[] = { 92, 7, 12, 9, 8, 3 };
		reveseFast(num);
	}

	public static void reveseFast(int num[]) {

		int max = num[num.length - 1];
		System.out.print(max + " ");

		for (int i = num.length - 1; i >= 0; i--) {

			if (num[i] > max) {
				System.out.print(num[i] + " ");
				max = num[i];
			}
		}
	}
}
