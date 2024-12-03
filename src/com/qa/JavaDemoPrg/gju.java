package com.qa.JavaDemoPrg;

import java.util.LinkedHashMap;
import java.util.Map;

public class gju {
	public static void main(String[] args) {

		String s = "ABBCCCDDDDA";
		int n = s.length();
		int count = 1;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, count);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (char key : map.keySet()) {
			if (key > 1) {
				System.out.print(key + "" + map.get(key));
			}
		}

	}

}
