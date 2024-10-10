package JAVAPROGRAM;

import java.util.HashMap;
import java.util.Iterator;

public class RemoveDuplicateLetter {

	public static void main(String[] args) {

		String s = "12244agdtrtfmfn";
		String output = "";

		char[] chars = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), 1);
		}

		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {

			output = output + it.next();

		}
		System.out.println(output);
	}
}
/*
 * public static void main(String[] args) { String str = "SSDRRRTTYYTYTR";
 * Map<Character, Integer> hMap = new HashMap<>();
 * 
 * for (int i = str.length() - 1; i >= 0; i--) {
 * 
 * if (hMap.containsKey(str.charAt(i))) {
 * 
 * int count = hMap.get(str.charAt(i)); hMap.put(str.charAt(i), ++count); } else
 * { hMap.put(str.charAt(i), 1); } } System.out.println(hMap); }
 * 
 * }
 */