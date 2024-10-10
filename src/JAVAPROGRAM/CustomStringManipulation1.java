package JAVAPROGRAM;

//public class AmstrongNo2 {

/*
 * public static void main(String[] args) {
 * 
 * String s = " today234have2310selenium9876Inteview "; String[] input =
 * s.split("[a-zA-Z]"); System.out.println(input);
 * 
 * // s.regex("//d+")
 * 
 * String strWithoutSpace = s.replaceAll("\\s", "");
 * System.out.println("Output is :" + strWithoutSpace);
 * 
 * } }
 */

public class CustomStringManipulation1 {

	public static void main(String[] args) {
		String input = "Today is January 5th";
		String output = customManipulation(input);
		System.out.println(output);
	}

	public static String customManipulation(String input) {
		// Split the input string into words
		String[] words = input.split(" ");
		StringBuilder result = new StringBuilder();

		// Reverse the order of words
		for (int i = words.length - 1; i >= 0; i--) {
			String word = words[i];

			// If the word is numeric (like "5th"), just add it to the result
			if (word.matches(".*\\d.*")) {
				result.append(word);
			} else {
				// Split the word into two halves
				int mid = word.length() / 2;

				String firstHalf = word.substring(0, mid);
				String secondHalf = word.substring(mid);

				// Append the second half first, then the first half
				result.append(secondHalf).append(firstHalf);
			}

			// Add a space between words
			if (i != 0) {
				result.append(" ");
			}
		}

		return result.toString();
	}
}
