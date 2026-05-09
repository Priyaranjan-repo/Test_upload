public class ReverseEachWord {
	
	
	
	public static void main(String[] args) {
		
	 String s= "I Love Java";
			 //  I evoL avaJ 

	 String word[] = s.split(" ");
	 
	 for(String rev: word) {
		 System.out.print(reverseN(rev)+" ");
	 }

		}

		static String reverseN(String s) {

			String rev = "";

			for (int i = 0; i < s.length(); i++) {

				rev = s.charAt(i) + rev;

			}
			return rev;
		}

	}