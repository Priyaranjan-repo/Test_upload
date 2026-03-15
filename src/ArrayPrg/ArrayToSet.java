package ArrayPrg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
	public static void main(String[] args) {
		String[] arr = { "apple", "banana", "apple", "orange", "banana" };

		// Convert array to HashSet

		Set<String> set = new HashSet<>(Arrays.asList(arr));

		System.out.println("Set: " + set);
	}
}
