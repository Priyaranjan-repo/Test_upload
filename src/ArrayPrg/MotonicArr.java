package ArrayPrg;

public class MotonicArr {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, -5 };

		boolean incresing = true;

		boolean decresing = true;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				decresing = false;

			} else if (arr[i - 1] < arr[i]) { // 7>5
				incresing = false;
			}
		}

		if (incresing || decresing) {
			System.out.println("the given array is monotonic");

		} else {
			System.out.println("the given array is not monotonic");
		}
	}

}
