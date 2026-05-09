package StringChallange;

public class PanagramCheck {
	
	
	// letter shouukd be 26 or more than 26 
	
	
	public static void main(String[] args) {
		String s ="THE SKY IS BLUE AND SOMETIMES DIFFREENT COLORS";
		s= s.toLowerCase();
		boolean result =isPanagram(s);
		
		if(result) {
			System.out.println("panagram");
		}
		else {
			System.out.println("Not a panagram");
		}	
		
	}

	 static boolean isPanagram(String s) {
		if(s.length()<26) {
			return false;
		}
		
		for(char i ='a' ;i<='z';i++) {
			if(s.indexOf(i)<0) {
				
			}
			return false;
		}
		return true;
	}
	
	
	
	
}
