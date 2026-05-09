package programs;

public class PrimeNo {

	public static void main(String[] args) {

		System.out.println(isPrimeNo(1000));
		System.out.println(isPrimeNo(31));

	}

	public static boolean isPrimeNo(int n) {
		
		
		boolean isPrime = true;
		
		for (int i = 2; i < n / 2; i++) {
			
			//System.out.println(i);
			if (n % i == 0) {
				isPrime = false;
				break;
			}

		}
		return isPrime;

	}

}
