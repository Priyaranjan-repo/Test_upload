public class CheckPallindrome {

	public static void main(String[] args) {

		/*
		 * String so = "MADAM"; reverse(so)
		 */;

	}

	public static void reverse(String free) {

		String rev = "";
		String s = "MOM";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

			if (s.equals(rev)) {
				System.out.println(s + " is a palindrome.");
			} else {
				System.out.println(s + " is not a palindrome.");

			}
		}

	}
}