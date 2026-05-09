package Interview;

public class SwapStringwithOut3rd {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//
//		a = a + b;
//
//		b = a - b;
//
//		a = a - b;

		// System.out.println(a + " - " + b);

		String a = "abc";
		String b = "xyz";

		System.out.println("------------------------------");
		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println(a + "--" + b);
		
		// System.out.println(b);

	}
}

//a=a+b;
//b = a-b;
//a=a-b;
