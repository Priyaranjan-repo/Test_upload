package programs;


public class CountWord {

	public static void main(String[] args) {
		String s ="Hello world";
		countChar(s);
		
	}
	
	
	
		
		
	    public static void countChar(String str) {
			
		char[] ch= str.toCharArray();
		
		
		for (int i = 0; i < ch.length; i++) {
			String q ="";
			
   //char not space
		while(i< ch.length && ch[i]!=' ' ) {
			q = q+ ch[i];
		  i++;
	
		}
	    
		if(str.length() > 0) {
			System.out.println(str+ "->"  +str.length());
		}
		}
		
		}
	   
}
	
