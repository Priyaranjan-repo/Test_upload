import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {

		String str = "TESTAutomation"; // Input string

		LinkedHashSet<Character> charSet = new LinkedHashSet<>();

		// Step 2: Add characters to the set (automatically removes duplicates)
		for (char c : str.toCharArray()) {
			charSet.add(c);
		}

		// Step 3: Construct the result string from the set
		StringBuilder result = new StringBuilder();
		for (char c : charSet) {
			result.append(c);
		}

		// Output the result
		System.out.println("String after removing duplicates: " + result.toString());
	}
}
