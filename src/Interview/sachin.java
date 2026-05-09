package Interview;

public class sachin {

	public static void main(String[] args) {
		// revesr string

		String s = "Sachin";// nIhCaS

		String op = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			if (i % 2 == 0) {

				// System.out.print(i);

				op = op + (s.charAt(i) + "").toUpperCase();

			} else {

				op = op + s.charAt(i) + "";
			}

		}

		System.out.println(s);
		System.out.println(op);

	}

}
