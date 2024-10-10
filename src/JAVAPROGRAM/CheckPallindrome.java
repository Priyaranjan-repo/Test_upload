package JAVAPROGRAM;

public class CheckPallindrome {

	public static void main(String[] args) {

		String s = "mita";
		String s2 = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			char ch = s.charAt(i);

			s2 = s2 + ch;
		}
		System.out.println(s2);

		if (s.equals(s2)) {
			System.out.println("Pallindrome");

		} else {
			System.out.println("not pallindrome");
		}

	}
}

// password - mita mobile 19 43 57

/*
 * System.out.println("Enter a string:"); String str = scanner.nextLine();
 * String rev = "";
 * 
 * int length = str.length(); for (int i = length - 1; i >= 0; i--) { rev = rev
 * + str.charAt(i); }
 * 
 * if (str.equals(rev)) { System.out.println(str + " is a palindrome.
 */