import java.util.HashMap;
import java.util.Map;

public class MaxOccurrenceWord {

	public static void main(String[] args) {
		String input = "I am am giving my selenium interview interview interview";
		findMaxOccurrenceWord(input);
	}

	public static void findMaxOccurrenceWord(String input) {
		// Convert the string to lowercase and split it by spaces to get individual
		// words
		char[] chars = input.toCharArray();
		String[] words = splitString(input, ' ');

		// Create a map to store the word and its count
		HashMap<String, Integer> wordCountMap = new HashMap<>();

		// Count occurrences of each word
		for (String word : words) {
			if (wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word) + 1);
			} else {
				wordCountMap.put(word, 1);
			}
		}
		// Find the word with the maximum occurrence
		String maxWord = "";
		int maxCount = 0;

		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxWord = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		// Print the word with the maximum occurrence
		System.out
				.println("The word with the maximum occurrence is: " + maxWord + " (occurred " + maxCount + " times)");
	}

	// Function to split string based on the delimiter without using inbuilt methods
	public static String[] splitString(String str, char delimiter) {
		int wordCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == delimiter) {
				wordCount++;
			}
		}
		String[] words = new String[wordCount + 1];
		int start = 0;
		int wordIndex = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == delimiter) {
				words[wordIndex] = str.substring(start, i);
				start = i + 1;
				wordIndex++;
			}
		}

		words[wordIndex] = str.substring(start);
		return words;
	}
}
