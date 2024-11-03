
import java.util.HashMap;
import java.util.Map;

public class DuplicateWordCount {

	public static void main(String[] args) {
		// Input string
		String input = "I am learning Java Java is fun learning Java is exciting";

		// Call the function to count duplicate words
		countDuplicateWords(input);
	}

	public static void countDuplicateWords(String str) {
		// Convert the string to lowercase and split it into words

		String[] words = str.toLowerCase().split("\\s+");

		HashMap<String, Integer> map = new HashMap<>();

		// Count the occurrences of each word
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
		// Print the words that appear more than once
		System.out.println("Duplicate words in the string:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
			}
		}
	}
}
