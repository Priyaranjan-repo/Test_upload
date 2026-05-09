package DemoCheckAskedInterview;

import java.io.InvalidClassException;

public class CustomException {

	public static void main(String[] args) {

		try { 
			validate(13);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	static void validate(int age)  throws Exception {

		if (age < 18) {
		
	     	throw InvalidAgeException("age is not to vote");
		
		} else {
			
			System.out.println("Welcome to vote");
		}
	}

	private static Exception InvalidAgeException(String str) {
		return null;

		//super(str);
	}

}
