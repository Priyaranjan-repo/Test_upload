

public class factotial {
	
	public static void main(String[] args) {
		FactNumber(5);
		
	}
	
	
	public static void FactNumber(int n) {
		int fact = 1;
	
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial no "+n+" is :"+ fact);
	
	}
	
}