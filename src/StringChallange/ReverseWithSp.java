package StringChallange;

import java.util.Stack;

public class ReverseWithSp {

	public static void main(String[] args) {
		String input = "I love  Java";
		System.out.println("Original:  " + input);
		System.out.println("Reversed:  " + reverseWithSpaces(input));
	}

	public static String reverseWithSpaces(String str) {
		char[] arr = str.toCharArray();

		char[] result = new char[arr.length];

		// Mark spaces in result
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				result[i] = ' ';
			}
		}
		// Use a stack to store characters
		Stack<Character> stack = new Stack<>();
		for (char ch : arr) {
			if (ch != ' ') {
				stack.push(ch);
			}
		}

		// Reinsert characters while preserving spaces
		for (int i = 0; i < arr.length; i++) {
			if (result[i] != ' ') {
				result[i] = stack.pop();
			}
		}

		return new String(result);
	}
}
