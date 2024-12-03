package softwareTestingGO;

import java.util.Arrays;

public class remioveDupArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 23, 53, 1, 4, 5, 2, 4 };

		System.out.println(Arrays.toString(arr));
		// using stream

		int dup[] = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(dup));

	}

}
