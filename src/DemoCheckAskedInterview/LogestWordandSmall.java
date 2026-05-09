package DemoCheckAskedInterview;

public class LogestWordandSmall {

	public static void main(String[] args) {

		String str = "Mango tree are shows well";

		String word[] = str.split(" ");

		String smallWord = "";

		String longWord = "";

		for (int i = 0; i < word.length; i++) {

			smallWord = longWord = word[0];

			if (word[i].length() < smallWord.length()) {

				smallWord = word[i];

			} else if (word[i].length() < longWord.length()) {

				longWord = word[0];

			}

		}
		System.out.println("longest word : " + longWord);

		System.out.println("smallest word : " + smallWord);

	}

}
