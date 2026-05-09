package practice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {

	public static void main(String[] args) {
		String str = "testinfqapage";

		Map<Character, Integer> map = new HashMap();

		for (char ch : str.toCharArray()) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

		}
		System.out.print(map +"\n");

		for (char c : map.keySet()) {

			if (map.get(c) > 1) {

				System.out.println(c + " --> " + map.get(c));
			}
		}
	}
}