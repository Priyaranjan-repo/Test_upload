public class PrimeCheck {

	public static void main(String[] args) {

		int n = 18;
		System.out.println(isPrimeNo(n));
	}

	public static boolean isPrimeNo(int num) {

		boolean isPrime = true;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
