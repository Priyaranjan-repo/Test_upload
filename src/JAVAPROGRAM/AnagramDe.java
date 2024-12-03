package JAVAPROGRAM;

import java.util.Arrays;

public class AnagramDe {

	public static void main(String[] args) {
		// String s1 = "Silent"; // race,care
		// String s2 = "Listen";

		System.out.println(isAnagramSort("Silent", "Listen"));

	}

	public static boolean isAnagramSort(String str1, String str2) {

		String string1 = str1.replaceAll("\\s", "");
		String string2 = str1.replaceAll("\\s", "");

		if (string1.length() != string2.length()) {
			return false;
		} else {

			char[] a1 = string1.toLowerCase().toCharArray();
			char[] a2 = string2.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			return Arrays.equals(a1, a2);
		}
	}
}
