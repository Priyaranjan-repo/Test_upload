import java.util.LinkedHashMap;
import java.util.Map;

public class occurance {

	public static void main(String[] args) {

		String s = "Priyaranjandass";

		// String str = "Welcome to Selemium Interview";
		countCharFreq(s);

	}

	public static void countCharFreq(String str) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] word = str.toCharArray();

		for (char ch : word) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Repeating chararcter is :" + entry.getKey() + " - " + entry.getValue() + " times");
		}

	}

}