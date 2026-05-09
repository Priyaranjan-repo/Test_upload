package interview1;
import java.util.Arrays;

public class SmallestWordStream {
    public static void main(String[] args) {
        String str = "learning java programming";

        String smallest = Arrays.stream(str.split(" "))
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                
             //   .min(a1, b1) -> Integer.compare(a.length(), b.length()))
                .orElse("");

        System.out.println("Smallest word: " + smallest);
    }
}
