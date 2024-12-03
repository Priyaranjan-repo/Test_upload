package JAVAPROGRAM;

import java.sql.ResultSet;

public class ReveseLasttoFastInstring {

	public static void main(String[] args) {

		String str = "java code is very good";

		String word[] = str.split(" ");

	

		String result = "";
		
		for (int i = word.length - 1; i>= 0; i--) {
			result += word[i] + " ";
}
		
		System.out.println("reverse last to fast :"+result);
		
		
}
}
