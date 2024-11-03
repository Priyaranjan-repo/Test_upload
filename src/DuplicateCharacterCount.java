
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
		// Input string
		String input = "programming"; // out put how many times each charter print
		// programming

		countDuplicateCharacters(input);
	}

	public static void countDuplicateCharacters(String str) {
		// Create a HashMap to store character counts
		HashMap<Character, Integer> charCountMap = new HashMap<>();

		// Convert the string to a character array
		char[] charArray = str.toCharArray();

		// Count the occurrences of each character
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		System.out.println(charCountMap);
		// Print the characters that appear more than once
		System.out.println("Duplicate characters in the string:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			// if (entry.getValue() > 1) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
		}
	}
}
