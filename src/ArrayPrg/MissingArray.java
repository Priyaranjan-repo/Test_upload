package ArrayPrg;

public class MissingArray {

	public static void main(String[] args) {

		int r[] = { 1, 2, 3, 4, 6 };

		// 1+2+3=6
		// n(n+1)/2

		int sum = 0;

		for (int i = 0; i < r.length; i++) {
			sum = sum + r[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 6; j++) { // use last ele in arry declare j<6

			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		System.out.println("missing num is " + (sum1 - sum));

	}

}
