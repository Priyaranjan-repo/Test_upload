
public class Main {
	public static void main(String[] args) {

		String fru = "GTI9980I7976ODO4435jf";

		String aplha = fru.replaceAll("[^a-zA-z]+", "");

		String nos = fru.replaceAll("[^0-9]", " ");

		System.out.println(aplha);
		System.out.println(nos);

	}
}
