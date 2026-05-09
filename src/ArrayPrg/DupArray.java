package ArrayPrg;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupArray {

	public static void main(String[] args) {

		// duplicate ele :20
//		duplicate ele :30
//		duplicate ele :10

		int n[] = { 10, 20, 30, 40, 20, 30, 50, 10, 60 };
		dupUsingSet(n);
	}

	public static void dupUsingSet(int[] arr) {

		Set<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (set.contains(arr[i])) {

				System.out.println("duplicate ele :" + arr[i]);
			} else {
				set.add(arr[i]);
			}

		}
	}

}
