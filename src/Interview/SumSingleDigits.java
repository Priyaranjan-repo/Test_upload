package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SumSingleDigits {

	public static int singleDigits(int n) {

		int sum = 0;
		int rem = 0;

		while (n > 9) {
			sum = 0;

			while (n > 0) {
				rem = n % 10;
				sum = sum + rem;
				n = n / 10;
			}
			n = sum;
		}
		return sum;

	}

	public static void main(String[] args) {

		System.out.print(singleDigits(12545));


		// ------------------------------------------------//
		Consumer<String> con1 = (t) -> System.out.println("Value is " + t);
		Consumer<String> con2 = (t) -> System.out.println("Value is " + t + "Upadte");

		List<String> names = new ArrayList<>();
		names.add("Java");
		names.add("Selenium");
		names.add("RestAsssured");

		names.forEach(con1.andThen(con2));

	}
}
