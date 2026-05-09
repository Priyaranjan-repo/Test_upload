package Interview;

import java.util.Arrays;

public class Inteview1 {

	public static void main(String[] args) {
//		 
//				 5) String a= ""I Love Java""
//				 O/p avaJ evoL I
//				 6) String a = ""abc-2019""
//				 O/p
//				 [abc]
//				 [2019]
//				 7) Practical usage of StringBuffer

	         String a = "abc-2019";      
	         
	      String[] alpha  =  a.split("[^a-z]");
	       
	        String [] nos= a.split("[^0-9]+");
 	         
	         System.out.println(Arrays.toString(alpha));      	
	    	//[abc]
		    //   [, 2019]
	        
	         System.out.println(Arrays.toString(nos));

}

}
	


