package Interview;

public class ReveseEach {

	public static void main(String[] args) {

		String s = "this is Interview"; // siht si weivretnI

		// reverse each word

		String[] word = s.split(" ");

		for (String e : word) {

			System.out.print(reverseM(e) + " ");
		}

	}

	public static String reverseM(String s) {

		String rev = "";

		for (int i = 0; i < s.length(); i++) {

			rev = s.charAt(i) + rev;

		}
		return rev;
	}

}
