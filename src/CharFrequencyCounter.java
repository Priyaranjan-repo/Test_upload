// Input: AAAABBCCCDDDDEEEG
public class CharFrequencyCounter {
	// Output: A4B2C3D4E3G1

	public static void main(String[] args) {
		String input = "AAAABBCCCDDDDEEEG";
		String output = getCharacterFrequency(input);
		System.out.println("Output: " + output);
	}

	public static String getCharacterFrequency(String input) {
		if (input == null || input.isEmpty()) {
			return "";
		}

		StringBuilder result = new StringBuilder();
		int count = 1;

		// Iterate through the string to count consecutive characters
		for (int i = 1; i < input.length(); i++) {
			// Check if the current character is the same as the previous one
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				// Append the character and its count to the result
				result.append(input.charAt(i - 1)).append(count);
				count = 1; // Reset the count for the new character
			}
		}

		// Append the last character and its count
		result.append(input.charAt(input.length() - 1)).append(count);

		return result.toString();
	}
}
