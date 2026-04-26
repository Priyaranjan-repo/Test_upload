package softwareTestingGO;

public class Program27 {

	// Input: I am learning Java interview
	// Output: i ma gninrael avaJ weivretni

//	public static void main(String[] args) {
//		String s = "I am learning Java interview";
//
//		String op = "";
//
//		String[] word = s.split(" ");
//
//		for (int i = 0; i < word.length; i++) {
//			op = op + word[i] + " ";
//
//		}
//
//		System.out.println(reverse(word));
//
//	}
//
//	public static String reverse(String str[]) {
//		String rev = "";
//		for (int i = str.length - 1; i > 0; i--) {
//
//		}
//		return rev;
//
//	}
	// I ma gninrael avaJ weivretni
	public static void main(String[] args) {
		String ip = "I am learning Java interview";
		String op[] = ip.split(" ");
		String op1 = "";
		for (int i = 0; i < op.length; i++) {
			op1 = op1 + new StringBuffer(op[i]).reverse().toString() + " ";
		}

		System.out.println(op1.trim());
	}
}
