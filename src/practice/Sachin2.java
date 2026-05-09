package practice;

public class Sachin2 {

	public static void main(String[] args) {
		String str = "Sachin"; // nIhCaS

		String op = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			
			if(i%2==1) {
				op =op+ (str.charAt(i)+"").toUpperCase();		
				}
			else {
				op = op+str.charAt(i)+"";
			}
		

	}
		System.out.println(str);
		System.out.println(op);

	}
}
