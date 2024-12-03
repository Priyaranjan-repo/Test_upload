package com.qa.JavaPractice;

public class ReveseEacH {

	public static void main(String[] args) {

	/*
	 * String str = "Today is interview"; // weivretni si yadoT
	 * System.out.println(reverseMe(str)); }
	 */
	//public static String reverseMe(String s) {
		//String reverse = " ";
		String str = "Today Is Interview";
		
//		for (int i = str.length()-1; i>=0; i--) {
//			
//			System.out.print(str.charAt(i));
//			

		String op = "";
		  String ip[] = str.split(" ");
		  
		  for (int i = 0; i < ip.length; i++) {
			  
			  op = op + new StringBuffer(ip[i]).reverse().toString()+" ";
			
		}
		  System.out.println(op.toString());
		 

	
	}
	}

