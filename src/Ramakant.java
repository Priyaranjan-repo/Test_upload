import java.util.LinkedHashMap;
import java.util.Map;

public class Ramakant {

	public static void main(String[] args) {

		String str = "Ramakant";

		String op = "";

		// R1a1m1a2k1a3n1t1

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
