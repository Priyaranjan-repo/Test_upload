package StringChallange;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupString1 {

	public static void main(String[] args) {
		// output = jav
		String s = "priyaranjan";

		removeDup(s);
	}
	public static void removeDup(String str) {

		Set<Character> set = new HashSet<Character>();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);// s

			if (!set.contains(ch)) {
				
				set.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}
// a= a+b // 3 5 =8
// b =a-b; b=2
// a = a-b 8-
// temp = num1;
// num1= num2;
// num2 = temp;
