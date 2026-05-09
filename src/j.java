
public class j {
	
	
	public static void main(String[] args) {
		
		
		//0 1 1 2 3 5 
		
		int n1= 0;
		int n2  =1;
	int temp;	
		
	System.out.print(n1+" "+n2);

	for(int i =0;i<10;i++) {
		temp = n1+n2;
		n1=n2;
		n2= temp;
		System.out.print(temp+" ");
	}
	
	}
	

}
