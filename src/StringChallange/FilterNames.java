package StringChallange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Ankit", "Bob", "Arun", "Dev");

		List<String> result = names.stream().filter(name -> name.startsWith("A")).map(String::toLowerCase)
				.collect(Collectors.toList());

		System.out.println(result); // [ALICE, ANKIT, ARUN]
	}
}
