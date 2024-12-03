package com.qa.JavaDemoPrg;

import java.util.Scanner;

public class ReverseNu {
	
	public static void main(String[] args) {
		
		
		
		//int n =3168;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =55420;
		String s = String.valueOf(n);
		int i=Integer.parseInt(s);
		System.out.println(i);
		int rev =0;
		
		while(n!=0) {
			int digit = n%10;
			rev = rev*10+ digit;
			n = n/10;
			
		}
		System.out.println(rev);
	}

}

// convert it into string and then reverse string