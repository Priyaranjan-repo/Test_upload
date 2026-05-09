package Interview;

public class SumDigits {

	public static void main(String[] args) {

//		String nos = String.valueOf(n);
//
//		System.out.println(nos);
//
//		for (int i = 0; i < nos.length(); i++) {
//
//			String sum = Integer.parseInt(nos) + " ";
////
		System.out.println(SumDigits.getSingleDigit(4243));

	}
	public static int getSingleDigit(int n) {

		int sum = 0;
		int rem = 0;

		while (n > 10) {
			sum = 0;
			while (n > 0) {

				rem = n % 10;// 3
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		return sum;
	}

}
