package StringChallange;

public class Getxpath {

	public static void main(String[] args) {

		System.out.println(getXpath("Ranjan"));

	}

	public static String getXpath(String name) {

		String xpath = "//input[@id =' " + name + " ']";

		return xpath;

	}
}
