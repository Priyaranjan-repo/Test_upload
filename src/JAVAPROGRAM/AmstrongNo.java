package JAVAPROGRAM;

public class AmstrongNo {

	public static void main(String[] args) {

		int temp = 0;
		int rev = 0;
		int n = 153;
		int originalNo = n;

		while (n > 0) {

			temp = n % 10;
			rev = rev + (temp * temp * temp);

			n = n / 10;
		}

		if (originalNo == rev) {

			System.out.println("This is amstong number");

		} else {

			System.out.println("This is not amstrong no");
		}
	}
}
