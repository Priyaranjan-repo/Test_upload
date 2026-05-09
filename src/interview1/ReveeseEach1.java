
package interview1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReveeseEach1 {

	
	public static void main(String[] args) {
		
		String str ="rahul sharma";   //luhar amrahs

		String word[]= str.split(" ");
//		
		//using java 8 
//
//		String result = Arrays.stream(word)
//		    .map(wd -> new StringBuilder(wd).reverse().toString())
//		    .collect(Collectors.joining(" "));
		
		if(word.length == 2) {
			
		String op= new StringBuilder(word[1]+" "+word[0])
			.reverse()
			.toString();

		
		System.out.println("result:"+ op+" ");

		}else {
			System.out.println("enter 3 char");
	
		}

	
	}
	
	}
