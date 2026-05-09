package Interview;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String str = "hello 324 how are you ";
		int sum = 0;
		int evenValueSum = 0;
		int oddValueSum = 0;

		boolean isDigitExits = false;

		for (int i = 0; i < str.length(); i++) {

			Character ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				isDigitExits = true;
				int digit = sum + Character.getNumericValue(ch);
				sum += digit;
				if (digit % 2 == 0) {
					evenValueSum += digit;

				} else {
					oddValueSum += digit;
				}
			}
		}
		if (isDigitExits) {

			System.out.println("Total sum of all digits:" + sum);
			System.out.println("even number total  digits:" + evenValueSum);
			System.out.println("odd number of all digits:" + oddValueSum);

		} else {
			System.out.println("theres is no digits");
		}

	}

}
