package StringChallange;

import JavaQuiz.stringmethods;


public class ReplaceVowel {

	
//select e1.ename As Employee ,e2.ename AS Manger
//	from Employee e1
//	
//	join employee e2 ON 
//	e1.mgr_id = e2.emp_id;
	

	
	public static void main(String[] args) {
			
		String s ="Tomorrow"; // T$m$rr$w
	
	String newValue	= s.replace("o","$");
	System.out.println(newValue);
		
	
	
		StringBuilder sb = new StringBuilder();
		
		for(char ch:s.toCharArray()) {
			
		if(vowel(ch)) {
			sb.append("$");
		}
		else {
			sb.append(ch);
		}
			
		}
		System.out.println(sb.toString());
	
	}
		
	
	static boolean vowel(char ch) {
				
		return  ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch =='u';
		}
		
		
	}
