
public class PrimeNo{

	public static void main(String[] args) {
		
     System.out.println(isPrimeNo(34));
     System.out.println(isPrimeNo(5));
     System.out.println(isPrimeNo(30));
		
		
	}
	
	static boolean isPrimeNo(int num) {
	
		if(num<=1) {
			return false;
		}
		
		for(int i =2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				
			return false;	
			}
			
		}
		
		return true;
	}
}
