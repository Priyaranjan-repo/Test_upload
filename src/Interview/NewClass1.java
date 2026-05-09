package Interview;


	
	public class NewClass1 {

	    public static void main(String args[]) {

	        NewClass1 obj = new NewClass1();
	        obj.print1to200divBy1and3();
	    }

	    public void print1to200divBy1and3() {

	        for (int i = 1; i <= 200; i++) {

	            if (i % 6 == 0 && i % 3 ==0 ) {
	                System.out.print(i+" ");
	            }
	        }
	    }
	}

