package JAVAPROGRAM;

public class ArrayMethod {

	public static int Method1(int a[]) {

		int sum = 0;
		// int arr[] = new int[4];
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int a[] = { 31, 3768, 55, 323 };
		int total = Method1(a);

		System.out.println(total);

	}
}
