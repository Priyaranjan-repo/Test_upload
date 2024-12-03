import java.security.PublicKey;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		
		int n[]= {9,8,7,5,6};
		for(int i:n) {
			System.out.println(i);
		}
		bubblesort(n);
		System.out.println("After sorting");
		for(int i:n) {
			System.out.println(i);
		}
	}
	
		
		public static void bubblesort(int[] intArray) {
			
	
		
		for (int i = 0; i <intArray.length; i++) {
			
			
			for (int j = 0; j < (intArray.length)-1 ; j++) {
				
				if( intArray[j-1]>intArray[j]) {
					int temp=  intArray[j-1];
					intArray[j-1] = intArray[j];
					intArray[j] = temp;
					
					
				}
				
			}
		}
		
	}

}
