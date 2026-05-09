package DemoCheckAskedInterview;

public class PallindromeString {

	public static void main(String[] args) {

		checkPallindrome("MADAM");
			
	}
	static void checkPallindrome(String str) {
	String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev += str.charAt(i) ;
		}
		if (str.equals(rev)) {

			System.out.println("This is pallindrome");
		} else {
			System.out.println("This is not pallindrome");
		}

	}

}
