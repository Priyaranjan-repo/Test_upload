package pattern_prog;

public class Inter_1 {

//	1*3456
//	12*456
//	123*56
//	1234*6
//	123456

	
	public static void main(String[] args) {
		
		
		
		for (int i = 0; i <= 5; i++) {
			
			for (int j = 1; j <6 ; j++) {
				System.out.print(j+" ");
			}
			System.out.print(" * ");
			
			for (int j=i+2; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}
