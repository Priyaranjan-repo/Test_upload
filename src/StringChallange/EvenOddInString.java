package StringChallange;

public class EvenOddInString {

	public static void main(String[] args) {

		String str = "Sky is blue and vast ";

		String[] arr = str.split(" ");

		for (String word : arr) {

			if (word.length() % 2 == 0) {

				System.out.println("print even: " + word);
			}

			else {
				System.out.println("print odd:" + word);
			}

		}

	}

}
