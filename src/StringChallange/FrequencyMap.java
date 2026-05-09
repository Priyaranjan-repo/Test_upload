package StringChallange;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {

	public static void main(String[] args) {

		String str = "Madam name is mita";

		Map<Character, Integer> map = new HashMap();

		for (Character ch : str.toCharArray()) {

			if (map.containsKey(ch)) {

				// map.put(ch, map.get(ch) + 1);

				map.put(ch, map.getOrDefault(ch, 0) + 1);

			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);
		System.out.println("===================");
		for (char ch : map.keySet()) {
			if (map.get(ch) ==1) {
			System.out.println(ch + "-- " + map.get(ch));
		}
		}
	}
}
