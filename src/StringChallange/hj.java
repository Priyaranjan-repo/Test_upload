package StringChallange;

public class hj {
	
	
	public static void main(String[] args) {
		

	String s="mita sahoo";  // atim oohas

	String wd[]= s.split(" ");
	if(wd.length == 2) {
	String result= new StringBuilder(wd[1]+" "+wd[0])
			.reverse()
			.toString()
			;
	  System.out.println("Output:"+result+" ");
		
	}else {
	
	  System.out.println("enter 2 word ");
	}
}

}