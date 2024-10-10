package JAVAPROGRAM;

public class CountGivenString {

	public static int CountString(String str) {

		int count = 0;
		char word[] = str.toCharArray();

		for (int i = 0; i < word.length; i++) {
			count++;
		}

		return count;
	}

	public static void main(String[] args) {

		System.out.print(CountString("sanghamitra"));

	}

}
