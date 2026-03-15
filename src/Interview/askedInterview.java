package Interview;

public class askedInterview {

	public static void main(String[] args) {

		String input = "k3t3m2y4p6"; // kkktttmmyyyypppppp
		convertDigit(input);

	}

	public static void convertDigit(String str) {

		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));

			
			} else {
				
				int z = Character.getNumericValue(str.charAt(i));
				
				for (int j = 1; j < z; j++) {
				
					System.out.print(str.charAt(i - 1));
				}
			}
		}
	}
}

//kkttmmppppppppppp
