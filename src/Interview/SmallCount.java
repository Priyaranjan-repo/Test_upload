package Interview;

public class SmallCount {

	public static void main(String[] args) {

		String s = "This is Priyaranjan";

		String[] word = s.split(" ");

		String smallestWord = word[0]; // assume

		for (String wd : word) {

			if (wd.length() < smallestWord.length()) {
				smallestWord = wd;
			}

		}
		System.out.println("smallest word count :" + smallestWord);

	}
}
