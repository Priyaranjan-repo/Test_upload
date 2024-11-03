package softwareTestingGO;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program35 {

	public static void main(String[] args) {

		// 35. Write a Program For the Below Output
		// Input: Ramakant
		// Output: R1a1m1a2k1a3n1t1

		String str = "Ramakant";
		String op = " ";
		Map<Character, Integer> map = new LinkedHashMap();

		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
				op = op + ch + map.get(ch);
			} else {
				op = op + ch + "1";
				map.put(ch, 1);
			}

		}
		System.out.println(op);
	}
}
