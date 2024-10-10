package JAVAPROGRAM;

public class ReverseEachWord {

	public static void main(String args[]) {

		String s2 = "I am Giving Interview ";

		// output :-I ma gnibiG weivretnI
		String[] word = s2.split(" ");

		for (String n1 : word) {
			System.out.print(reverse(n1) + " ");
		}
	}

	static String reverse(String str) {

		String reverse = "";

		for (int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}

		return reverse;

	}
}
