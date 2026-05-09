package Interview;

public class TransformString {

	public static void main(String[] args) {
		String input = "ame3tup5hjkl7ttdlt9t";
		String output = transformString(input);
		System.out.println("Output: " + output);
	}

	public static String transformString(String input) {

		if (input == null || input.isEmpty()) {
			return "";
			// Handle empty input
		}

		StringBuilder result = new StringBuilder();

		// Iterate through each character in the input string

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			// If the character is a digit, transform it

			if (Character.isDigit(currentChar)) {

				int digit = Character.getNumericValue(currentChar);
				int transformedDigit = 10 - digit; // Replace d with (10 - d)
				result.append(transformedDigit);
			} else {
				// If it's not a digit, append it as is
				result.append(currentChar);
			}
		}

		return result.toString();
	}
}
