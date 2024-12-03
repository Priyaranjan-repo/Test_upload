package softwareTestingGO;

import java.util.HashSet;
import java.util.Set;

public class duplicate_array {

	public static void main(String[] args) {
		int a[] = { 2, 10, 12, 23, 45, 56, 23, 34, 2, 10 };

		// int[] array = { 1, 2, 5, 6, 87, 5, 87, 78, 6, 6, 7, 2 };

		Set<Integer> dup = new HashSet<Integer>();

		for (int i : a) {

			if (dup.add(i)) {
				System.out.print(" " + i);
			}
		}
	}
}

//2 10 12 23 45 56 34