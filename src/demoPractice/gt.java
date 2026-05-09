package demoPractice;

public class gt {
	
	
	public static void main(String[] args) {
		

	String str = "hello78824how are you";
	int sum=0;
	
	for(int i =0;i<str.length();i++) {
		char ch  = str.charAt(i);

	if(Character.isDigit(ch)) {
		sum = sum+Character.getNumericValue(ch);
		
	}
		
	}
	System.out.println(sum);

	
	}
			
}
