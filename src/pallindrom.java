
public class pallindrom {

	public static void main(String[] args) {

		String rev = "";
		String s = "MADAMd";
		int length = s.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (s.equals(rev)) {
			System.out.println(s + " is a palindrome.");
		} else {
			System.out.println(s + " is not a palindrome.");
		}
	}
}
