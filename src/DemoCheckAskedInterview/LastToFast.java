package DemoCheckAskedInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LastToFast {

	public static void main(String[] args) {
//
//		String str = "Sanghamitra";
//		StringBuilder sb = new StringBuilder();
//
//		Set<Character> set = new LinkedHashSet();
//
//		for (int t = 0; t < str.length(); t++) {
//
//			char ch = str.charAt(t);
//
//			if (!set.contains(ch)) {
//				set.add(ch);
//				sb.append(ch);
//			}
//		}
//		System.out.println(sb.toString());
//	}
//}

		// reverse last to fast

//		String str = "This is java program";
//
//		List<String> word = Arrays.asList(str.split("\\s"));
//
//		for (int i = word.size() - 1; i >= 0; i--) {
//			System.out.print(word.get(i) + " ");

		String str = "This is java program";

		List<String> word = Arrays.asList(str.split("\\s"));

		Collections.reverse(word);

		for (String w : word) {
			System.out.print(w + ' ');
		}

	}

}