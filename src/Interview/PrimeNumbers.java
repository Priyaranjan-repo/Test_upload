package Interview;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {
			
			System.out.println(i + "\n");
			
			System.out.println(isPrime(i) + "\n");
		}
	}

	
	
	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			
		  if (n % i == 0) {
				return false;
			}
		}

		return true;

	}
}
