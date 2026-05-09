package StringChallange;

import java.util.HashMap;
import java.util.Map;

public class SpecialChar {

	public static void main(String[] args) {

		String str = "abc#@#!";

		Map<Character, Integer> frequency = new HashMap<Character, Integer>();

		for (Character ch : str.toCharArray()) {

			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || (ch == ' '))) {

				if (frequency.containsKey(ch)) {

					frequency.put(ch, frequency.get(ch) + 1);

				} else {
					frequency.put(ch, 1);
				}
			}
		}

		System.out.println(frequency);
	}

}
