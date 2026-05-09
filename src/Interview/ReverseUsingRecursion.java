package Interview;

public class ReverseUsingRecursion {

	public static void main(String[] args) {

		rev(4895);

	}

	public static void rev(int n) {

		if (n < 10) {
			System.out.print(n);
		}

		else {

			System.out.print(n % 10);

			rev(n / 10);
			
		}
	}

}
