package softwareTestingGO;

import java.util.LinkedHashMap;

public class Program35 {

	public static void main(String[] args) {

		// 35. Write a Program For the Below Output
		// Input: Ramakant
		// Output: R1a1m1a2k1a3n1t1

		String str = "Ramakant";
		// String str = "priyaranka";
		String op = " ";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : str.toCharArray()) {

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
				op = op + c + map.get(c);

			} else {
				op = op + c + "1";
				map.put(c, 1);
			}
		}
		System.out.println(op);
	}
}
