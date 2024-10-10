package JAVAPROGRAM;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatCharString {

	public static void main(String[] args) {

		String input = "SeleniumTesting  $$ __";
		Map<Character, Integer> map = new LinkedHashMap();

		char[] chars = input.toCharArray();

		for (char ch : chars) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);

			} else {
				int count = map.get(ch);
				map.put(ch, count + 1);

			}
		}
		System.out.println(map);
	}
}
