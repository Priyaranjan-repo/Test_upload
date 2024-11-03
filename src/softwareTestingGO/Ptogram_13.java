package softwareTestingGO;

import java.util.LinkedHashMap;

public class Ptogram_13 {

	public static void main(String[] args) {

		// Output: A4D3C3A1

		String ip = "AAAADDDCCCA";
		String op = "";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < ip.length(); i++) {

			if (map.containsKey(ip.charAt(i))) {
				map.put(ip.charAt(i), map.get(ip.charAt(i)) + 1);
			} else {
				map.put(ip.charAt(i), 1);
			}
		}

		for (Character c : map.keySet()) {
			op = op + c + map.get(c);
		}

		System.out.println(op);

	}
}
