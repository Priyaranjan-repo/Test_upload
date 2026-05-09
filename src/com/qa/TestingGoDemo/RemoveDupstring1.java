package com.qa.TestingGoDemo;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupstring1{

	public static void main(String[] args) {

		String s = "Ranjangahhaas";

		System.out.println(removeDup(s));

	}

	public static String removeDup(String str) {

		Set<Character> dupSet = new HashSet<Character>();

		StringBuffer sf = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {// traverse the loop to exrarct s

			Character c = str.charAt(i);// R
			if (!dupSet.contains(c)) { // if not matched add ele
				dupSet.add(c);
				sf.append(c);
			}

		}
		return sf.toString();

	}

}
