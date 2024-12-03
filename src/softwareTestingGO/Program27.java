package softwareTestingGO;

public class Program27 {

	// Input: I am learning Java interview

	public static void main(String[] args) {
		String s = "I am lea678rning Java inte9988rview";

		String op = "";

		String word = s.replaceAll("[^0-9]+", " ");
		String[] oe = s.split("\\d+");
		String word1[] = s.split("[a-z]+");

//		System.out.println(Arrays.toString(word1));
//		System.out.println(Arrays.toString(oe));

		for (int i = 0; i < word1.length; i++) {

			op = op + new StringBuffer(word1[i]).reverse().toString() + " ";

		}
		System.out.println(op);

//Regex regex = new Regex(@"[\d]+");
		// (?<=\\D)(?=\\d)"
		// st.replaceAll("[^0-9]", "");
	}
}
