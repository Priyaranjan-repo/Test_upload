
public class sumofNosintosingle {

	public static void main(String[] args) {

		int n = 9765;
		int rem = 0;
		int sum = 0;

		while (n > 9) {
			sum = 0;

			while (n > 0) {
				rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		System.out.println(sum);
	}

}
