package programs;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		String fru = "GTI9980I7976ODO4435jf";

		String[] alpha = fru.split("[^a-zA-z]+");

		String nos[] = fru.split("[^0-9]");

		System.out.println(Arrays.toString(alpha));
		System.out.println(Arrays.toString(nos));

	}
}
