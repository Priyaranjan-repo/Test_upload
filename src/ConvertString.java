import javax.swing.Spring;

public class ConvertString {
	
	
	public static void main(String[] args) {
	
		String a ="10";
		int s =Integer.parseInt(a);
		System.out.println(s);
		
		int b= 90;
		
		String ss = String.valueOf(b);
		System.out.println(ss);
		String strNumber = Integer.toString(b);
		System.out.println(strNumber);
		
		 String format = String.format("%d", b); 
		 System.out.println(format);
		
	}
	}
//Converting an int to a String 
		
//
//	String s="I am learning java";
//	
// String word[]	= s.split(" ");
//	String op ="";
//  for (int i = 0; i <word.length; i++) {
//	  op = op+ new StringBuffer(word[i]).reverse().toString()+" ";
//	
//}
//  
//  System.out.println(op);
//
//	
//	}}

