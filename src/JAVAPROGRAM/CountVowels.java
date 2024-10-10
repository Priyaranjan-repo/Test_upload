package JAVAPROGRAM;

public class CountVowels {

	public static void main(String[] args) {

		String str = "abxxjkdkcddire";

		String vowel = "aeiou";

		int count = 0;
		for (int i = 0; i <= str.length(); i++) {

			if (vowel.indexOf(str.charAt(i)) != -1) {
				count++;
			}
		}
		System.out.println("total voewel is:" + count);
	}
}
