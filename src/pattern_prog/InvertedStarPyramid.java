package pattern_prog;

public class InvertedStarPyramid {
	public static void main(String[] args) {
		int rows = 9; // Set the number of rows you want to print

		for (int i = 1; i < rows; i++) {
			// Print leading spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// Print asterisks with spaces
			for (int j = 1; j < rows - i; j++) {
				System.out.print(j + " ");
			}

			// Move to the next line after each row
			System.out.println();
		}
	}
}

/*
 * 
 * * * * * * * * * * * * * * * * * * * * * *
 * 
 * 
 * 
 * 
 */