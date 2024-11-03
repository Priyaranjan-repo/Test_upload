
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// Create a Scanner object to take input from the user
		Scanner sc = new Scanner(System.in);

		// Input the number to be reversed
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		// Call the function to reverse the number
		int reversedNumber = reverseNumber(number);

		// Output the reversed number
		System.out.println("Reversed number: " + reversedNumber);
	}

	public static int reverseNumber(int num) {
		int reversed = 0;

		// Loop to reverse the digits of the number
		while (num != 0) {
			int digit = num % 10; // Get the last digit of the number
			reversed = reversed * 10 + digit; // Append the digit to the reversed number
			num /= 10; // Remove the last digit from the original number
		}

		return reversed;
	}
}
