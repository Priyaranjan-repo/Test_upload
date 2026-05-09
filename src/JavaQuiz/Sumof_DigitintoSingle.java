package JavaQuiz;

public class Sumof_DigitintoSingle {

	// sum of number and print as single

	public static void main(String[] args) {
		System.out.println(getSingle(2234));
	}

	static int getSingle(int num) {
		// m%10; sum =0;

		int sum = 0;
		int rem = 0;

		while (num > 9) {
			sum = 0;
			while (num > 0) {

				rem = num % 10;
				sum = sum + rem;
				num /= 10;

			}

			num = sum;
		}

		return sum;

	}
}
