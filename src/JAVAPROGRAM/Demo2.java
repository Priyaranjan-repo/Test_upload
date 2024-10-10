package JAVAPROGRAM;

public class Demo2 {

	public static void main(String[] args) {

		String s1 = "java code program";

		String[] word = s1.split("");
		for (String s : word) {
			System.out.print(reveseWord(s) + "");
		}
	}

	public static String reveseWord(String str) {
		String reverse = "";

		for (int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		return reverse;

	}
}
