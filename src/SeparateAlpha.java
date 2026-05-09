public class SeparateAlpha {

	public static void main(String[] args) {

		String str = "Time3455watch233";

		char[] arr = str.toCharArray();

		StringBuffer nos = new StringBuffer();

		StringBuffer alpha = new StringBuffer();

		for (char c : arr) {

			if (Character.isAlphabetic(c)) {
				alpha.append(c);

			} else if (Character.isDigit(c)) {
				nos.append(c);

			}

		}

		System.out.println(nos.toString());
		System.out.println(alpha.toString());

	}

}
