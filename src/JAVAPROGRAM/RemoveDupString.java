package JAVAPROGRAM;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupString {

	public static void main(String[] args) {

		String str = "aAAABNSsssssKKDLbbccdee";

		StringBuilder sb = new StringBuilder();

		// can use Linked hashset for ordering
		Set<Character> set = new HashSet();
		for (int i = 0; i < str.length(); i++) {

			set.add(str.charAt(i));
		}
		for (Character ch : set) {
			sb.append(ch);
		}

		System.out.println(sb);
	}
}
