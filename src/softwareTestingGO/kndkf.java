package softwareTestingGO;

public class kndkf {

	public static void main(String[] args) {

		String ip = "Hello world,welcome to my world,my world";

		// world world,my my to world,welcome Hello

		System.out.println(reverseMe(ip));
	}

	private static String reverseMe(String string) {
		// TODO Auto-generated method stub
		String reverse = "";
		String s[] = string.split(" ");
		for (int i = s.length - 1; i >= 0; i--) {
			reverse = reverse + s[i] + " ";
		}
		return reverse;
	}

}
