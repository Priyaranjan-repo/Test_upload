package com.qa.JavaDemoPrg;

import java.util.HashMap;

public class gj {

//	 * Input: AAAADDDCCCA
//	 *
//	 * Output: A4D3C3A1
//	 *
	public static void main(String[] args) {
		String str = "AAAADDDCCCA";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i <= str.length(); i++) {
			Character ch = str.charAt(i);

			if (map.containsKey(ch)) {
				int count = map.get(ch);
				count++;
				map.replace(ch, count);
			}

			else {
				map.put(ch, 1);
			}
		}

		for (Character key : map.keySet()) {

			System.out.print(key + "" + map.get(key));
		}

	}
}
