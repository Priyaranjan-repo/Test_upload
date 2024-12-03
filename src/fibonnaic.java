
public class fibonnaic {

	
	//0 1 1 2 3  5  8
	public static void main(String[] args) {
		
		int firstNo = 0;
		int secondNo = 1;
		int temp;
		int n =10;
		System.out.println();
		for (int i = 0; i <=n; i++) {
			
			System.out.print( firstNo+ " " );
			temp = firstNo + secondNo;
			firstNo = secondNo;
			secondNo = temp;
			
		}
		
		
		
		
		
	}
	
}
