package StringChallange;

public class ReverseOnlyAlpha {

	static String in = "45Autosdet25";

	// static char word[] = in.toLowerCase().toCharArray();

	static char word[] = in.toCharArray();

	public static void main(String[] args) {

		StringBuilder alpha = new StringBuilder();
		for (Character ch : word) {

			if (Character.isAlphabetic(ch)) { // 45tedsotuA25

				// 45tedsotuA2tedsotuA5
				alpha.append(ch);
			} else {
				reverseAlphaBets(alpha);
				System.out.print(ch);
			}

		}
		// reverseAlphaBets(alpha);

	}

	public static void reverseAlphaBets(StringBuilder alpha) {
		String rev = " ";
		for (int i = alpha.length() - 1; i >= 0; i--) {
			System.out.print(alpha.charAt(i));
		}
		alpha.setLength(0);
	}
}
