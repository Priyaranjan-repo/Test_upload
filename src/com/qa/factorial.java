package com.qa;

public class factorial {

	public static void main(String[] args) {

		int num = 6;
		int factorial = 1;// 6!=6*5*4*3*2

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;

		}
		System.out.println(factorial);
	}

}
