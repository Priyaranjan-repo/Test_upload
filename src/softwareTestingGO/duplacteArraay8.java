package softwareTestingGO;

import java.util.Arrays;

public class duplacteArraay8 {

	public static void main(String[] args) {

		int n[] = { 2, 10, 12, 23, 45, 56, 23, 34, 2, 10 };  //[2, 10, 12, 23, 45, 56, 34]


		System.out.println(Arrays.toString(n));
		// using stream

		int[] b = Arrays.stream(n).distinct().toArray();

		System.out.println(Arrays.toString(b));

	}

}
