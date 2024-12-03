package softwareTestingGO;

public class sumofDigi {

	public static void main(String[] args) {

		String s = "1234gj5";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			if (Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);

			}
		}
		System.out.println(sum);

	}

}
