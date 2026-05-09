package practice;

public class prime {

	static boolean isPrime(int n) {
		// for (int i = 2; i < n / 2; i++) { //o(n) is less

		for (int i = 2; i <= Math.sqrt(n); i++) {

			if (n % i == 0) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(36));
		System.out.println(isPrime(6));
		System.out.println(isPrime(0));
		System.out.println(isPrime(45));
		System.out.println(isPrime(7));
	}
}
