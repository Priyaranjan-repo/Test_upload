package softwareTestingGO;

import java.util.HashSet;
import java.util.Set;

public class removeDupString {

	public static void main(String[] args) {
		String str = "priyaranjan";
		System.out.println(dupString(str));

	}

	public static String dupString(String str) {
		Set<Character> dup = new HashSet<Character>();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {// extract each char in string
			Character c = str.charAt(i); // s

			if (!dup.contains(c)) {// is s is not in set
				dup.add(c); // add s to hashset
				sb.append(c); // s to sring bufeer

			}
		}
		return sb.toString();

	}

}
