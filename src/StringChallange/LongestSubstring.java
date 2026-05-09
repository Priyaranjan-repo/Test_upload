package StringChallange;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {

		String s1 = "abcdessee";
		
		String longestStr = "";
		
		String currentStr = "";

		Set<Character> charSet = new LinkedHashSet<Character>();

		for (int i = 0; i < s1.length(); i++) {

		
		for (int j = i; j < s1.length(); j++) {

				char ch = s1.charAt(j);

				if (!charSet.contains(ch)) {
					charSet.add(ch);
				} else if (charSet.contains(ch)) {

					currentStr = charSet.toString();
					if (currentStr.length() > longestStr.length()) {
						longestStr = currentStr;
					}
					charSet.clear();
					currentStr = "";
					break;
				}

			}
		}

		System.out.println(longestStr);

	}

}
