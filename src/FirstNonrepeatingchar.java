import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonrepeatingchar {

	public static void main(String[] args) {

		String str = "AmazonPrime";

		// using map
		Map<Character, Integer> map = new HashMap();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}

		}

	}
}
