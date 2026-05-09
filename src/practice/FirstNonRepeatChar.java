package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatChar {

	public static void main(String[] args) {

		String s = "flipkartseva";
		Map<Character, Integer> map = new HashMap();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, 1);
			}

		}
//		System.out.println(map);
		
		Set<Character> set =map.keySet();

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;

			}
		}
	}
}
