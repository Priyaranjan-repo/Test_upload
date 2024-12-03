package com.demoPractice;

import java.util.Scanner;

public class SwapWithout3rd {
	
	public static void main(String[] args) {
//		
//		int a = 10,b = 20;
//		
//		
//		a= a*b;
//		b=a/b;
//		a= a/b;
//		System.out.println("After swapping "+a);
//		System.out.println("After swapping "+b);
//		
//		
//		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result  = (num/2)* 2;
		if(result == num) {
			System.out.println("even number");
			
		}else {
			System.out.println("odd number");
		}
	}

}
