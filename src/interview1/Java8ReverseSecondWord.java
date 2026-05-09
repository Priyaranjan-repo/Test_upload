package interview1;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Java8ReverseSecondWord {
    public static void main(String[] args) {
       
    	String input = "rahul sharma";
        
    	String[] wd = input.split(" ");
        if (wd.length == 2) {
        	String result =  
                new StringBuilder(wd[1]+" "+wd[0])
                    .reverse()
                    .toString();

            System.out.println("Output: " + result +" ");
        } else {
            System.out.println("Input must contain exactly two words.");
        }
    }
}
