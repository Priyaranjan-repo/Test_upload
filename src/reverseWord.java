
public class reverseWord {

	public static void main(String[] args) {

		// World Java to Welcome
		String s = "Welcome to Java World";

		String word[] = s.split(" ");
		String reverse = "";

		for (int i = word.length - 1; i >= 0; i--) {

			System.out.print(word[i] + " ");
		}

	}
}
