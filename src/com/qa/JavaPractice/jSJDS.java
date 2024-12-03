package com.qa.JavaPractice;

public class jSJDS {
	
	public static void main(String[] args) {
		

		String input = "I am giving selenium 220Interview";
	
	
	    String word[] = input.split(" ");
	    
		String op1="";
	   
	    for (int i = 0; i < word.length; i++) {
	    	op1= op1+ new StringBuffer(word[i]).reverse().toString()+" ";
	     
	    }
	    System.out.println(op1);
	}




}
