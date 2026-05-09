package Interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupStr {

    public static void main(String[] args) {

        String s="Programming";
        Set<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (char c : set) {
            System.out.print(c);
        }
    }
}