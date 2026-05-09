package Interview;

import java.util.Arrays;

public class AnagramTest{

	// Write a Java Program for given Strings are anagram or not str1 = "tomato",
	// str2 = "matoto"?

	public static void main(String[] args) {

		String str1 = "tomato";
		String str2 = "matoto";
		
		System.out.println(isAnagram(str1, str2));

	}

	static boolean isAnagram(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;

		}
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);

	}
}
