package JAVAPROGRAM;

public class TotalCount {

	public static void main(String[] args) {

		String str = "The best of both worlds";

		int count = 0;

		// Counts each character except space

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				count++;
			}
			System.out.println("Total number of characters in a string: " + count);

		}
	}
}
