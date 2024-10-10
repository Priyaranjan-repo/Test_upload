package JAVAPROGRAM;

public class UpperCaselowerCase {

	/*
	 * public static void convertString(StringBuffer str) {
	 * 
	 * int len = str.length(); for (int i = 0; i < len; i++) {
	 * 
	 * Character c = str.charAt(i); if (Character.isLowerCase(c)) {
	 * 
	 * str.setCharAt(i, Character.toUpperCase(c));
	 * 
	 * } else { str.setCharAt(i, Character.toLowerCase(c)); } }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { StringBuffer str = new
	 * StringBuffer("MitaSanghamitra"); convertString(str);
	 * 
	 * } }
	 */

	public static void main(String[] args) {
		String input = "Hello-LOL ";
		String output = swapCase(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String swapCase(String str) {
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];

			if (Character.isUpperCase(ch)) {
				charArray[i] = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				charArray[i] = Character.toUpperCase(ch);
			}
		}
		return new String(charArray);
	}
}
