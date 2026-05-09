public class MissingArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 4, 5, 6 }; // Input array
		int totalNos = 6;

		int sumOfAllnos = totalNos * (totalNos + 1) / 2;

		System.out.println(sumOfAllnos);

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println(sum);

		int missArr = sumOfAllnos - sum;

		System.out.println("the missing nos of array is:" + missArr);

	}

};