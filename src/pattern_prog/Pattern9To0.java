package pattern_prog;

public class Pattern9To0 {

//	9876
//	543
//	21
//	0

	public static void main(String[] args) {

		int num = 9;
		for (int i = 5; i >= 1; i--) {

		    for (int j = 1; j <= i; j--) {
		        System.out.print(num);
		        num--;
		    }
		    System.out.println();
		}
	}

}