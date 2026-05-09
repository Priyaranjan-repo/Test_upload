package StringChallange;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class Random {
	
	public static void main(String[] args) {
		
		
		RandomGenerator rg = new java.util.Random();
		System.out.println(rg.nextInt(3));
		
		
	System.out.println(Math.rint(5));
	
//	System.out.println(rg.r/andomNumeric);
	
	
	System.out.println("====================");
	
	
	String nos ="@@#$$$!@#$%%&**(&^%$#&&^***6684$$@@!!!#ood";
	
	 nos =nos.repeat(4);
	 String number =nos.replaceAll("[^0-9]","");
	 System.out.println(number.toString());
	 
	 String s1=nos.replaceAll("[^a-zA-Z0-9]", "");
	 
	 System.out.println(nos);
	 System.out.println(s1.toString());
	 
	 
	 
	 
	 //check isAnagram or not 
	         String str1="stop";
	 
	 String str2 ="topsfuj";
	 
	 
	 
	 
	 
//	 if(str1.length()!=str2.length()) {
		
		 
//	 }else {
		 
		 char c1[]= str1.toLowerCase().toCharArray();
		 char c2[]= str1.toLowerCase().toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
		 if(Arrays.equals(c1,c2)) {
			 System.out.println("both strings are Anagram");
	 }
		 else {
			 System.out.println("both strings are not  Anagram");
			 
		 }
		
		
	}

}
