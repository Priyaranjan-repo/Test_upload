package Interview;

public class SmallestWord {

	public static void main(String[] args) {

		String str = "learning java programming";

		String[] word = str.split(" ");

		String longest = "";
		String smallest = "";

		for (int i = 0; i < word.length; i++) {
			if (i == 0) {
				longest = smallest = word[0];
			} else

			if (word[i].length() < smallest.length()) {
				smallest = word[i];
			} else if (word[i].length() < longest.length()) {
				longest = word[0];

			}

		}
		System.out.println("longest word :" + longest);
		System.out.println("smallest  word :" + smallest);

	}
}
