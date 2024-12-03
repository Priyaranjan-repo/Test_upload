package softwareTestingGO;

public class UpperCaselowerCase {

	/*
	 * public static void convertString(StringBuffer str) {
	 * 
	 * int len = str.length(); for (int i = 0; i < len; i++) {
	 * 
	 * Character c = str.charAt(i); if (Character.isLowerCase(c)) {
	 * 
	 * str.setCharAt(i, Character.toUpperCase(c));
	 * 
	 * } else { str.setCharAt(i, Character.toLowerCase(c)); } }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { StringBuffer str = new
	 * StringBuffer("MitaSanghamitra"); convertString(str);
	 * 
	 * } }
	 */

	public static void main(String[] args) {
		String input = "Hello-LOL ";
		String output = swapCase(input);

		System.out.println("Input: " + input);
		System.out.println("Output: " + output);
	}

	public static String swapCase(String str) {
		

		char [] word=str.toCharArray();
		
		for (int i = 0; i < word.length; i++) {
			
			char c =word[i];
			
			if(Character.isUpperCase(c)) {
				word[i] = Character.toLowerCase(c);
				
			}
			else if (Character.isUpperCase(c)) {
				word[i]= Character.toLowerCase(c);
			}
		}
		
		return new String(word);
		//String result = new String(chars);
	}
}
