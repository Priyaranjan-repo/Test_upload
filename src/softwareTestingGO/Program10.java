
package softwareTestingGO;

import java.util.Arrays;

public class Program10 {
	public static void main(String[] args) {

		/*
		 * Input: [A, B, C, D] Output: AA BB CC DD
		 * 
		 * if u put j<4 [AAAA, BBBB, CCCC, DDDD]
		 */

		String s[] = { "A", "B", "C", "D" };
		String o[] = new String[s.length];
		String s1 = "";
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < 3; j++) {
				s1 = s1 + s[i];
				o[i] = s1;
			}
			s1 = "";
		}

		System.out.println(Arrays.toString(o));
	}
}
