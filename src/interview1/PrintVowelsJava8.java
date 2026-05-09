package interview1;
import java.util.stream.Collectors;

public class PrintVowelsJava8 {
    public static void main(String[] args) {
        String str = "Priyaranjan";
        String vowels = str.toLowerCase().chars()
            .mapToObj(c -> (char) c)
            .filter(c -> "aeiou".indexOf(c) != -1)
            .map(String::valueOf)
            .collect(Collectors.joining(" "));

        System.out.println("Vowels in the string: " + vowels);
    }
}
