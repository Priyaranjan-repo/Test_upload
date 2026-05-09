package com.qa;

public class SumofDigits {

	public static void main(String[] args) {

		String str = "welcome125345jf";
		
		int sum = 0;
		
		for (int j = 0; j < str.length(); j++) {

		Character ch = str.charAt(j);

		
	   if(Character.isDigit(ch)) {
		   sum = sum +Character.getNumericValue(ch);
	   }

	}
System.out.println(sum);
}
}
