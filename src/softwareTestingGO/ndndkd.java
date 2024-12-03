package softwareTestingGO;

import java.util.LinkedHashMap;
import java.util.Map;

public class ndndkd {
	// ip = "AAAADDDCCCA";
	// Output: A4D3C3A1

	public static void main(String[] args) {

		String s = "AAAADDDCCCA";

		int n = s.length();
		int count = 1;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, count);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (char key : map.keySet()) {
			if (key > 1) {
				System.out.print(key + "" + map.get(key));
			}
		}

	}

}
