package practice;

public class ReverseSentences {
	
	
	public static void main(String[] args) {
		
		
		
		
		String s ="I am working in USA";
		
		//output =USA in working am I 
		String []word = s.split(" ");
//	for(String s1:word) {
//		
	
//	}System.out.println(reverseM(str)+" ");
	
	
			String rev=" ";
		for(int i =word.length-1;i>=0;i--) {
			
		rev = rev+s.charAt(i);	
	   rev 	= rev.trim();
	
		
		System.out.print(word[i]);
		}
	
	
	}
		
}
