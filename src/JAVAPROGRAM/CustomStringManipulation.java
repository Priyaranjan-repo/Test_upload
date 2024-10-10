package JAVAPROGRAM;

public class CustomStringManipulation {

	public static void main(String[] args) {
		String input = "Mita2025das";
		String output = manipulateString(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String manipulateString(String str) {
		String prefix = str.substring(0, 4); // Extract "Mita"
		String suffix = str.substring(8); // Extract "das"

		return prefix + "das" + "2025"; // Concatenate "Mita", "das", and "2025"
	}

}
