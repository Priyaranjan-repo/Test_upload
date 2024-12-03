package com.qa.JavaPractice;

public class xjjkdcdc {

	
	// Expected out out is "cba zyx"



public static void main(String[] args) {
	
	String str="abc xyz" ;

	String output[] = str.split("");

	String op ="" ;

	for(int i =0 ;i <output.length; i++ ){


	op = op+ new StringBuffer(output[i]).reverse().toString()+" ";

	}
	
	
	System.out.println(op);
}
}