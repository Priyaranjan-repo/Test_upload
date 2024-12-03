package softwareTestingGO;

public class Voewls {

	public static void main(String[] args) {

		String s = "sring bufeer";

		int count = 0;
		int consotant = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
					|| s.charAt(i) == 'e') {
				count++;
			} else {

				consotant++;
			}
		}
		System.out.println(count);
		System.out.println(consotant);

	}

}
