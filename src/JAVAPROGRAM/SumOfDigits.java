package JAVAPROGRAM;

public class SumOfDigits {

	public static void main(String[] args) {

		// Sum of digits

		// String strt = "bh334shjs4h5j242626#$$#$#2";

//		int sum = 0;
//		for (int i = 0; i < strt.length(); i++) {
//
//			if (Character.isDigit(strt.charAt(i))) {
//
//				sum = sum + Character.getNumericValue(strt.charAt(i));
//			}
//		}
//		System.out.print("Sum of all the digit present in String : " + sum);
//	}
//}

		String str = "bh92626#$$#$#2";
		char[] word = str.toCharArray();
		int sum = 0;

		for (Character ch : word) {
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);

			}
		}
		System.out.println(sum);
	}

}
