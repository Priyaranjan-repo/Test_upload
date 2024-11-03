package JAVAPROGRAM;

public class ReverseWordsWithNumbers {

	public static void main(String[] args) {
		String input = "today110is210my310interview";

		// output will "yadot110si210ym310weivretni"

		String output = reverseLettersInString(input);
		System.out.println(output);
	}

	public static String reverseLettersInString(String input) {
		StringBuilder result = new StringBuilder();
		StringBuilder currentSegment = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			// If the character is a letter, append it to the current segment
			if (Character.isLetter(currentChar)) {
				currentSegment.append(currentChar);
			} else {
				// If the character is a digit, reverse the current segment (letters) and append
				// to result
				result.append(currentSegment.reverse().toString());
				currentSegment.setLength(0); // Clear the segment

				// Append the digit and continue
				while (i < input.length() && Character.isDigit(input.charAt(i))) {
					result.append(input.charAt(i));
					i++;
				}
				i--; // Adjust the index after the loop
			}
		}

		// Append the final reversed segment if any
		result.append(currentSegment.reverse().toString());

		return result.toString();
	}
}
