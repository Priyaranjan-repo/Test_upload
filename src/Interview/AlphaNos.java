package Interview;

import java.util.Arrays;

public class AlphaNos {

	public static void main(String[] args) {

		String str = "This@#$)3546468)is!##$&&an#&*In455((*^$*(terview$*$";

		String[] alpha = str.split("[^a-zA-Z]+");
		
		String[] alpha1 = str.split("[^a-z]+");

		String[] number = str.split("[^0-9]+");

		System.out.println(Arrays.toString(alpha).replace(",", " "));

		System.out.println(Arrays.toString(number).replaceAll(",", " "));

	}
}
