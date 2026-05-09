package StringChallange;

import java.util.Arrays;

public class SplitNosAlpha {

	public static void main(String[] args) {

		String str = "Ra124jk"; // split nos and alpha

		String alpha[] = str.split("[^0-9]+");
		
		System.out.println(Arrays.toString(alpha));

		String nos[] = str.split("[^a-zA-Z]+");
		              
		System.out.println(Arrays.toString(nos));

	}
}
		//anather way :
//		StringBuilder alpha = new StringBuilder();
//
//		StringBuilder nos = new StringBuilder();
//
//		char[] word = str.toCharArray();
//
//		for (char ch : word) {
//
//			if (Character.isAlphabetic(ch)) {
//				alpha.append(ch);
//			} else if (Character.isDigit(ch)) {
//				nos.append(ch);
//
//			}
//		}
//
//		System.out.println(alpha.toString());
//		System.out.println(nos.toString());
//	}
//
//}
