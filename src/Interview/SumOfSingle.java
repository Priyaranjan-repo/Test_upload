package Interview;

public class SumOfSingle {

	public static void main(String[] args) {
		int num = 998928;

		System.out.println(singleSumNo(num));

		System.out.println(singleSumNo(singleSumNo(num)));
	}

	static int singleSumNo(int nos) {

		int sum = 0;
		String op = nos + "";
		for (int i = 0; i < op.length(); i++) {

		sum =  sum + Integer.parseInt(op.charAt(i) + "");

		}
		return sum;

	}
}