package Interview;

public class NameInitials {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);// priya das //o/p - PD

		// Input full name
//		System.out.print("Enter your full name (First Middle Last): ");
//		String fullName = scanner.nextLine();

		String fullName = "Sangha Das Fisj";

		// Split the full name into parts
		String[] nameParts = fullName.split("\\s+"); // Split by spaces

		StringBuilder sb = new StringBuilder();

		// Extract initials
	for (String part : nameParts) {

			if (!part.isEmpty()) {
			
				sb.append(Character.toUpperCase(part.charAt(0))); // Get the first letter and convert to uppercase
			
			}
		}
		// Print the initials

		System.out.println("Initials: " + sb.toString());

		// scanner.close();
	}

}