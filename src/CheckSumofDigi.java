
public class CheckSumofDigi {

	public static void main(String[] args) {

		String str = "1265Test356";

		char[] word = str.toCharArray();
		int sum = 0;

		for (int i = 0; i < word.length; i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}

		}
		System.out.println(sum);

	}
}
