package StringChallange;

public class SplitCharAndDigit {

	public static void main(String[] args) {

		String str = "Time3455EX@$$watch233";// separate digit and char

		StringBuffer nos = new StringBuffer();
		StringBuffer alpha = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

		char ch = str.charAt(i);

			if (Character.isAlphabetic(ch)) {

				alpha.append(ch);
			} else if (Character.isDigit(ch)) {

				nos.append(ch);
			}
		}

		System.out.println(nos.toString());
		System.out.println(alpha.toString());

	}
}
