package JAVAPROGRAM;

import java.util.HashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		// output =a3b3c2d3

		// String s = "aaabbbccddd";

		String s = "i am giving interview ";
		char[] chars = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : chars) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		System.out.print(map);

	}
}
