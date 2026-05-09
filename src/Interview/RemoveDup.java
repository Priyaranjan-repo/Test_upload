package Interview;

import java.util.HashSet;
import java.util.Set;

public class RemoveDup {

    public static void main(String[] args) {

        //abcdd output -> abcd
        //(Use HashSet in this)
        String s = "abcdd";       // abcd
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<Character>();
        for (char ss : s.toCharArray()) {
            if (!set.contains(ss)) {

                set.add(ss);
                sb.append(ss);
            }
        }
        System.out.println(sb);

    }
}

