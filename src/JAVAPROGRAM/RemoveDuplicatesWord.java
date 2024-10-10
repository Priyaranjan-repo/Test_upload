package JAVAPROGRAM;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWord {
	public static void main(String[] args) {

		String sen = "Sam is is going to banglore banglore";
		String[] arr = sen.split(" ");

		Set<String> s = new LinkedHashSet<String>();

		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}

		for (String ss : s) {
			System.out.print(ss + "  ");
		}
		// System.out.println();

	}
}