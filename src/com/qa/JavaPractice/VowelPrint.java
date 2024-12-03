package com.qa.JavaPractice;

public class VowelPrint {

	public static void main(String[] args) {

		String s = "this is a picnic place";

		// char[] ch = s.toCharArray();
		int count = 0;
		int consonatCount = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {

				count++;
			} else {
				consonatCount++;

			}

		}
		System.out.println("vowel: " + count);
		System.out.println("conontabt: " + consonatCount);
	}

}
//
//		String s = "  abc!jhh#0987$jhhhh";
//		String s1 = s.replaceAll("[^0-9]", " ");
//		String[] s12 = s.split("[^0-9]");
//		System.out.println(s1);
//		System.out.println(s12.toString());
//
//		String replace = s.replaceAll("//d+", " ").trim();
//		System.out.println(replace);

//}}}
