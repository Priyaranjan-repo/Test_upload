package JAVAPROGRAM;

public class ReveseMe {

	public static String ReveseMe(String s1) {
		String reverse = " ";

		for (int i = 0; i < s1.length(); i++) {
			reverse = s1.charAt(i) + reverse;
		}
		return reverse;

	}

	public static void main(String[] args) {

		String input = "welcome to Java";
		String word[] = input.split(" ");

		for (String s : word) {
			System.out.print(ReveseMe(s) + " ");
		}
	}
}
