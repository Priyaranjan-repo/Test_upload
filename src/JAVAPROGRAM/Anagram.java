package JAVAPROGRAM;

import java.util.HashMap;
import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "keep";
		String s2 = "peek";
		boolean b = isAnaragam(s1, s2);
		System.out.println(s1 + " " + s2 + " are anagaram = " + b);
	}

	private static boolean isAnaragam(String s1, String s2) {

		boolean isAnagaram = true;
		if (s1.length() != s2.length()) {
			isAnagaram = false;
		} else if (s1.length() == s2.length()) {

			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < s1.length(); i++) {
				if (map.containsKey(s1.charAt(i))) {
					map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
				} else {
					map.put(s1.charAt(i), +1);
				}
			}
			for (int i = 0; i < s2.length(); i++) {
				if (map.containsKey(s2.charAt(i))) {
					map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
				} else {
					isAnagaram = false;
				}
			}
			Iterator<Character> it = map.keySet().iterator();
			while (it.hasNext()) {
				Character c = it.next();
				if (map.get(c) != 0) {
					isAnagaram = false;
				}
			}
		}
		return isAnagaram;
	}
}
