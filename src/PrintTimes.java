import java.util.HashMap;
import java.util.Map;

public class PrintTimes {

	public static void main(String[] args) {

		String str = "I am am giving my sele";
		char[] word = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : word) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}

			else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " -" + entry.getValue() + " -times");
		}
	}

}
