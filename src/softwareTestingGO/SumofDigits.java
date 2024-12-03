package softwareTestingGO;

public class SumofDigits {

	static String s = "12w3311es32334gj5";

	public static void main(String[] args) {

		int sum = 0;

		char word[] = s.toCharArray();

		for (Character c : word) {
			// boolean digit = Character.isDigit(c);
			// System.out.println(digit);

			if (Character.isDigit(c)) {

				sum = sum + Character.getNumericValue(c);

			}
		}
		System.out.println(sum);

	}
}
