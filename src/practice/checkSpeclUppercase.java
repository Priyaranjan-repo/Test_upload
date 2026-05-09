package practice;

public class checkSpeclUppercase {

	public static void main(String[] args) {
		String str = "fgdjdj$^%^&*@#@%^)**&^%  $%^&**fjjfkfklf";
		getMeTest(str);
	}

	static void getMeTest(String s) {

		StringBuilder sb = new StringBuilder();
		int upperChar;
		int lowerChar;
		int speclChar;
		int digits;
		int count = 0;

		for (int j = 0; j < s.length(); j++) {

			char ch = s.charAt(j);

			if (Character.isUpperCase(ch)) {
				sb.append(ch);

			} else if (Character.isLowerCase(ch)) {
				sb.append(ch);

			} else if (Character.isDigit(ch)) {
				sb.append(ch);

			}

		}
		System.out.println(sb);

	}
}
