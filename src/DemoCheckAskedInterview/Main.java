package DemoCheckAskedInterview;

public class Main {
	public static void main(String[] args) {
		InputValidator validator = new InputValidator();

		try {
			validator.validateEmail("invalidEmail.com"); // ❌ no @ symbol
		} catch (InvalidInputException e) {
			System.err.println("Exception Caught: " + e.getMessage());
		}

		try {
			validator.validateEmail("test@example.com"); // ✅ valid
		} catch (InvalidInputException e) {
			System.err.println("Exception Caught: " + e.getMessage());
		}
	}
}
