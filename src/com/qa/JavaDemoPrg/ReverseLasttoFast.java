package com.qa.JavaDemoPrg;

public class ReverseLasttoFast {
	
	
	public static void main(String[] args) {
		
		String  str ="World Java to Welcome";
		String word[]= str.split(" ");
		String op  =" ";
		for (int i = word.length-1; i>=0; i--) {
			//op = op +new StringBuffer(word[i]).reverse()+" ";
			
			
		
			System.out.print(word[i]+ " ");
			
	}

	}
}
