package JAVAPROGRAM;

public class ReverseStringParts {

	public static void main(String[] args) {
		String inputString = "abcd1234efgh5678";
		String outputString = reverseStringParts(inputString);

		System.out.println("Input String: " + inputString);
		System.out.println("Output String: " + outputString);
	}

	public static String reverseStringParts(String input) {
		char[] charArray = input.toCharArray();
		int startIndex = 0;

		while (startIndex < charArray.length) {
			int endIndex = startIndex;

			// Find the end index of the current substring (until a non-alphabetic character
			// or end of string)
			while (endIndex < charArray.length && Character.isLetter(charArray[endIndex])) {
				endIndex++;
			}

			// Reverse the substring
			reverseArray(charArray, startIndex, endIndex - 1);

			// Move to the next non-alphabetic character
			while (endIndex < charArray.length && !Character.isLetter(charArray[endIndex])) {
				endIndex++;
			}

			startIndex = endIndex; // Move to the next substring
		}

		return new String(charArray);
	}

	private static void reverseArray(char[] arr, int start, int end) {
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
