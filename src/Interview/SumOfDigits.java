package Interview;

public class SumOfDigits {
	
	
	public static void main(String[] args) {

		int no=5667;
		
		String op = no+"";

		int sum=0;
		for (int i = 0; i  <=op.length(); i++) {
			
			
	 sum =sum+ Integer.parseInt(op.charAt(i)+" ");
		
	}
		System.out.println(no);

}
}
