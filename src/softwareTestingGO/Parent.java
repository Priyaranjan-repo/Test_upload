package softwareTestingGO;

public class Parent {

	static void property() {
		System.out.println("home and money");
	}

	public strictfp void garden() {
		System.out.println("");
	}

	public static void Land() {
		System.out.println("some land is there ");
	}

	public static void main(String[] args) {

		Parent p = new Parent();

		p.garden();
		property();
		Land();

	}

}
