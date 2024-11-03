package com.qa.test;

public class fibonnaic {

	public static void main(String[] args) {

		// int a[]= {1,6,8,4,9,0,8,4};

		// In//tStream.range(0, 0).filter(null)

		int firstNum = 0;
		int SecondNum = 1;
		int n = 10;

		System.out.println("fibonnaic series" + n + "terms");
		for (int i = 1; i <= n; i++) {

			System.out.print(firstNum + " ");

			int temp = firstNum + SecondNum;
			firstNum = SecondNum;
			SecondNum = temp;

		}

	}

}
