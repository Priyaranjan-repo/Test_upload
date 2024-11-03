public class pattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			// inner loop for columns
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}
}

//1
/*
 * 12 123 1234
 */
