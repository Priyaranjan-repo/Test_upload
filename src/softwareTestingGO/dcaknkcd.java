package softwareTestingGO;

public class dcaknkcd {

	/*
	 * Input: he is a good boy
	 * 
	 *
	 * Output: yo bd o ogas ieh
	 */

	public static void main(String[] args) {

		String str = "he is a good boy";
		String op = new StringBuffer(str).reverse().toString();
		System.out.println(op);
		op = op.replaceAll(" ", "");
		String oop = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) + "").equals(" ")) {
				oop = oop + " ";
				++count;
			} else {
				oop = oop + op.charAt(i - count);
			}
		}
		System.out.println(oop);
	}

}
