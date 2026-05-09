package pattern_prog;

public class Pattern {

	public static void main(String[] args) {

		int rows = 4;

		for (int i = 4; i >= 0; i--) {

			for (int j = 1; j <= i; j++) {

				if (i % 2 == 1) {
					System.out.print("$");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}

//1234
//$$$
//12
//$