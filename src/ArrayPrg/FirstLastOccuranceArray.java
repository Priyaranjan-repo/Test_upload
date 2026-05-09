package ArrayPrg;

public class FirstLastOccuranceArray {

	public static void main(String[] args) {

		String input = "Hello World"; // 4 ,7

		int firstIndex = -1;

		int lastIndex = -1;

		for (int index = 0; index < input.length(); index++) {

			if (input.charAt(index) == 'o') {
				firstIndex = index;
				break;
			}
		}

		for (int index = input.length() - 1; index >= 0; index--) {

			if (input.charAt(index) == 'o') {
				lastIndex = index;
				break;
			}
		}
		System.out.println(firstIndex);
		System.out.println(lastIndex);

	}
}
