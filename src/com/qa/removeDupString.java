package com.qa;

import java.util.HashSet;
import java.util.Set;

public class removeDupString {

	public static void main(String[] args) {

		String s = "GitaBhagatRamayna";

		char word[] = s.toCharArray();

		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < word.length; i++) {
			
			Character ch = s.charAt(i);
			
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb);

}
}
