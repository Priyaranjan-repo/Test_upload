
public class PrintVowelCons {

	public static void main(String[] args) {

		String str = "trainEJourney";

		int count = 0;
		int consonant = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				count++;
			} else {
				consonant++;
			}

		}

		System.out.println("Vowel count:" + count);

		System.out.println("consonat count:" + consonant);
	}
}
