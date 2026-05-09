package interview1;

public class AskedInterview {
	
	
	public static void main(String[] args) {

	      String str="Priyaranjan Das XYZ";    //XYZ Das Priyaranjan
	      String wd[]=str.split(" ");   //if add space in split then op=Xyz DasPriyaranjan

//	      for(int i =str.length()-1;i>=0; i--) {  //zyX saD najnarayirP

        for (int i = wd.length-1 ;i>=0; i--) {
            System.out.print(wd[i]+" ");
//              System.out.println(str.charAt(i));
	      }
	}
}
