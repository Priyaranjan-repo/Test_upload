package ArrayPrg;

public class MissingArraywithXOR {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5, 6 }; // Input array

		int missingNo = 0;
		for (int nos : a) {

			missingNo = missingNo ^ nos;

		}
		for (int i = 0; i <= 6; i++) {
			missingNo = missingNo ^ i;
		}

		System.out.println(missingNo);
	}

};