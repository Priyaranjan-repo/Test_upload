package StringChallange;

//public class SortTestString {

//public static void main(String[] args) {

//	String s = "JAVA";

//		char[] word = s.toCharArray();
//
//		for (int i = 0; i < word.length; i++) {
//
//			for (int j = i + 1; j < word.length; j++) {
//
//				if (word[i] > word[j]) {
//					char temp = word[i];
//
//					word[i] = word[j];
//					word[j] = temp;
//
//				}
//
//			}
//
//		}
//		System.out.println(new String(word));
//	
public class InvalidStatusCodeException extends RuntimeException {
	
	
	public InvalidStatusCodeException(String message) {
		
		super(message);
	}

	public class MissingFieldException extends RuntimeException {
		
		public MissingFieldException(String message) {
			super(message);
		}
	}

}
