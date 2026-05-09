package Interview;

public class concat {

	public static void main(String[] args) {

		String x = "Hello";

		String y = "World";

		int a = 100;
		int b = 200;

		System.out.println(x + y);          //HelloWorld
		System.out.println(x + y + a + b);  //HelloWorld100200
		System.out.println(x + y + (a + b)); // helloworld300

	}

}
