package com.qa.JavaPractice;

public class ReveseEachWord {

	public static void main(String[] args) {

	String s = "I am Giving Interview ";  // output :-I ma gniviG weivretnI

		String op =" ";

		String[] word = s.split(" ");
		
		for (int i =0;i<=word.length-1; i++) {
			
			op = op +reverseMe(word[i])+" " ;
			
			
		}
		System.out.println(s);
		System.out.println(op.trim());
	}

	public static String reverseMe(String str) {
	
		String reverse = "";
	   for (int i =0; i<=str.length()-1 ; i++) {
			
			
			reverse = str.charAt(i) + reverse;
		}
		return reverse;
	}

}
