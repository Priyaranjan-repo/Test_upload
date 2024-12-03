
public class PrintNoOut{
	
	
	public static void main(String[] args) {
		printNos(0);
	}

	
	
	public static void printNos(int n) {
		if(n<=10) {
			System.out.println(n);
			printNos(n+1);
		}
	}
}
