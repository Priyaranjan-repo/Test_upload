package com.demoPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sort {
	
	public static void main(String[] args) {
		
		String a []= {"three","bet","dog","zebra","tiger","fan","apple"};
		Arrays.sort(a);
		
				for(String s:a) {
			System.out.println(s);
			//Collections.sort(a);
			
			//System.out.println("Aftr sort");
	
	
	}
		String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};   
		// sorts array[] in descending order   
		Arrays.sort(strarray, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(strarray));   

}

}
