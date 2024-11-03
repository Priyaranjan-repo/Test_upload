package softwareTestingGO;

public class program1 {

	// Expected: RTTTaeyamsptatea
	// RTTTaeyamsptatea
	public static void main(String[] args) {

		String arr[] = { "Rama", "Test", "Type", "Tata" };

		String op = "";

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// op = op + arr[i].charAt(i);
				op = op + arr[j].charAt(i);

			}
		}
		System.out.println(op);
	}

}
