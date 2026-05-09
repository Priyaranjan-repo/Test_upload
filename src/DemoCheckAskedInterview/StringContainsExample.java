package DemoCheckAskedInterview;

public class StringContainsExample {

	public static void main(String[] args) {
		String mainString = "Hello, welcome to Java programming!";
		String searchString = "the";

		// Using contains() method
		if (mainString.contains(searchString)) {
			System.out.println("The string contains: " + searchString);
		} else {
			System.out.println("The string does not contain: " + searchString);
		}
	}
}
