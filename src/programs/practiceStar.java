package programs;

public class practiceStar {

	public static void main(String[] args) {

		int rows = 8;          // Set the number of rows you want to print

		for (int i = 1; i <= rows; i++) {
			
			// Print leading spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Print numbers from 1 to i
			for (int j = 1; j <= i; j++) {
				 System.out.print( "* ");

//				System.out.print(j + " "); // number print . for printing star relace here with *

			}

			System.out.println();
		}

	}
}

/*
 * 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6 1 2 3 4 5 6 7 1 2 3 4 5 6 7 8 1 2 3
 * 4 5 6 7 8 9
 * 
 * 
 * 
 * 
 * 
 * 
 */
