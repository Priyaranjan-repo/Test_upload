import java.util.HashSet;
import java.util.Set;

public class removeDup {

	public static void main(String[] args) {

		String str = "Akekeraaklsrer";

//		StringBuilder sb = new StringBuilder();
//		str.chars().distinct().forEach(e -> sb.append((char) e));
//		System.out.print(sb);
//	}

		StringBuilder sb = new StringBuilder();

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!set.contains(ch)) {

				set.add(ch);
				sb.append(ch);

			}

		}

		System.out.println(sb.toString());

	}
}
