package StringChallange;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatdChar {

	public static void main(String[] args) {

		String str = "amazon";

		String op = " ";

		// using without collection
		// two for loop i and j take
		// and compare if uts eqqiual using charAt () .then brek and take if (condition
		// )
//
//		for (int i = 0; i < str.length(); i++) {
//			boolean unique = true;
//			for (int j = 0; j < str.length(); j++) {
//
//				if (i != j && str.charAt(i) == str.charAt(i)) {
//
//					unique = false;
//
//				}
//			}
//			if (unique) {
//				System.out.println(str.charAt(i));
//				break;
//
//			}
//
//		}
//	}
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
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + "  - " + entry.getValue());
				break;
			}
		}

//		for (Character ch : map.keySet()) {
//			// if (map.get(ch) > 1) {
//			op = op + ch + map.get(ch);
//
//			System.out.println(op);
//		}
	}

}
