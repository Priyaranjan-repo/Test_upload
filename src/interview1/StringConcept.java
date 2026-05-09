package interview1;

public class StringConcept{
	
	public static void main(String[] args) {
		
		String s="Age"+ 20;
		
		System.out.println(s);//Age20
		
		String s1 ="Hello" +"World";
		
		System.out.println(s1);
		
		
		System.out.println("=====================");

		String s2 = 10 + 10 + "Age";// 20Age

		String s3 = "Age" + 10 + 10; // Age1010

		String s4 = "Age" + (10 + 10); // Age20

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		String alphaElement ="a,,b,,c";
		
		alphaElement.indent(0);
		
//		alphaElement.getChars(0, 0, null, 0);
		String word2 =alphaElement.strip();
		System.out.println("White removed :"+word2);
		
		String[] word =alphaElement.split(",");
		
		
		
		System.out.println(word2.length());
		
		System.out.println(word.length);
		
	}

}
