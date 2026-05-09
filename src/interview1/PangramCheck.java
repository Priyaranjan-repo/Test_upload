package interview1;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {

	public static boolean isPangram(String str) {
		boolean isPangram = false;
		str = str.toLowerCase();

		// Create a set to store letters
		Set<Character> letters =    new HashSet<>();
                                        	
		// Iterate over characters and collect only alphabate
		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				letters.add(ch);
			}
		}
		// If set size is 26, it's a pangram
		
		if (letters.size() == 26) {
			isPangram = true;
		}
		return isPangram;
	}

	public static void main(String[] args) {

		String str = "The quick brown  fox jumps over the  dog";
		boolean result = isPangram(str);

		if (result) {
			System.out.println("✅ The string is a pangram.");
		} else {
			System.out.println("❌ The string is not a pangram.");
		}
	}
}
