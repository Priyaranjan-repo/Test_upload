package StringChallange;

import java.util.Stack;

public class ReverseStringPreserveSpaces {

	public static void main(String[] args) {
		String input = "I  love Java"; // Reversed: a vaJe volI
		String result = reverseStrPresSpaces(input);

		System.out.println("Original:  " + input);
		System.out.println("Reversed:  " + result);
	}

	public static String reverseStrPresSpaces(String str) {
		char[] arr = str.toCharArray();

		Stack<Character> stack = new Stack<>();

		// Push non-space characters onto the stack
		for (char c : arr) {
			if (c != ' ') {
				stack.push(c);
			}
		}

		// Replace non-space characters from the stack in reverse order
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				arr[i] = stack.pop();
			}
		}

		return new String(arr);
	}
}
