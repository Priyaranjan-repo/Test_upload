package pattern_prog;

public class printNusd {
	
	//   1
	//  1 2
	// 1  2  3 
	//1  2  3  4

	
	
	public static void main(String[] args) {
		
		//i =5, j = 5
		int num =1;
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
				//num++;
				
			}
			System.out.println(" ");
			
		}
		
	}
}
