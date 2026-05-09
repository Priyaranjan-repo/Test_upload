package JavaQuiz;

public class BreakDemo {

	public static void main(String[] args) {
//
//		for (int i = 0; i <= 10; i++) {
//
//			if (i == 6) {
//				break;
//			}
//			System.out.println(i);
//		}
//	}
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("monday");

			break;

		case 2:
			System.out.println("tue");

			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thrus");
			break;
		case 5:

			System.out.println("Fri");
			break;
		default:
			System.out.println("weekend");
		}
		System.out.println("==========================================");
		// do while loop
//		int count = 1;
//		do {
//			System.out.println("Count :" + count);
//
//		} while (count <= 5);

	}
}
//when i equla to 6 it will brek loop and print 1 to 5
//break condition is used loop  or switch case when certion condition is met 

//a while loop  repeat a block of code as long as condition is true.