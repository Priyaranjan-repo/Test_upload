package JAVAPROGRAM;

public class ToggleString {

	public static void main(String[] args) {

		String toggledString = toggleCharacters("Hello World!");

		System.out.println("Toggled String: " + toggledString);
	}

	// Function to toggle each character in a string
	public static String toggleCharacters(String str) {
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {

			char currentChar = charArray[i];

			// Toggle uppercase and lowercase letters
			if (Character.isUpperCase(currentChar)) {

				charArray[i] = Character.toLowerCase(currentChar);
			} else if (Character.isLowerCase(currentChar)) {

				charArray[i] = Character.toUpperCase(currentChar);
			}
			// Leave non-alphabetic characters unchanged
		}

		return new String(charArray);
	}

}
