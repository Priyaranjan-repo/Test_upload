package DemoCheckAskedInterview;

public class InputValidator {

	public void validateEmail(String email) throws InvalidInputException {
		if (email == null || !email.contains("@")) {
			throw new InvalidInputException("Invalid email provided: " + email);
		}

		System.out.println("Email is valid: " + email);
	}
}
