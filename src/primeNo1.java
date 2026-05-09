
public class primeNo1 {

	public static void main(String[] args) {
		
		System.out.println(isPrimeNo(23));

		System.out.println(isPrimeNo(3));
		System.out.println(isPrimeNo(2));

		System.out.println(isPrimeNo(2860));
	}

	public static boolean isPrimeNo(int num) {

		boolean isPrime = true;

		for (int i = 2; i < Math.sqrt(num); i++) {

			if (num % i == 0) {
				
				isPrime = false;
				
				break;
			}
		}

		return isPrime;
	}

}
