package JAVAPROGRAM;

public class ReverseStringWord {

	public static void main(String[] args) {
		String input = "I am giving my selenium interview";
		String output = reverseWords(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String reverseWords(String str) {

		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			result.append(reversedWord).append(" ");
		}

		return result.toString().trim();

	}

}
