package StringChallange;

public class UpperLowerDigit {

	
	
	public static void main(String[] args) {

		String d = "AutoMation LABS34";
		StringBuilder sbLower = new StringBuilder();
		StringBuilder sbUpper = new StringBuilder();
		StringBuilder sbDigit = new StringBuilder();

		char[] word = d.toCharArray();

		for (Character ch : word) {

			if (ch.isUpperCase(ch)) {
				sbLower.append(ch);
				
			} else if (ch.isLowerCase(ch)) {
				sbUpper.append(ch);
			}

			else if (ch.isDigit(ch)) {
				sbDigit.append(ch);

			}
		}
		System.out.println("uppercase Ele :" + sbLower);
		System.out.println("lowcase ele:" + sbUpper);
		System.out.println("uppercase ele:" + sbDigit);

	}
}

//output  
//lowcase :AMLABS
//uppercase ele:utoation
//uppercase ele:34
