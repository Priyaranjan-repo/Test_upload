package ArrayPrg;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 50, 49, 510};

        Optional<Integer> secondHighest = Arrays.stream(numbers)
                .boxed() // convert int to Integer
                .distinct() // remove duplicates
                //.sorted((a, b) -> b - a) // sort in descending order
               .sorted(Collections.reverseOrder())
                .skip(1) // skip the first (highest)
                .findFirst(); // get the second highest
        
        if (secondHighest.isPresent()) {
            System.out.println("Second highest number is: " + secondHighest.get());
        } else {
            System.out.println("Second highest not found");
        }
    }
}
