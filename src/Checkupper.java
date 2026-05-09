
public class Checkupper {

	public static void main(String[] args) {

		String str = "12AutoMATION664frine";

		StringBuilder sbUpper = new StringBuilder();

		
		for (char ch : str.toCharArray()) {

			
			if (Character.isUpperCase(ch)) {
				sbUpper.append(ch);
			}

		}

		System.out.println(sbUpper.toString());

	}
}
