package interview1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {

    public static void main(String[] args) {

        String str = "Sucess";

        str = str.toLowerCase() + " ";

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] word = str.toCharArray();
        for (Character ch : word) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);

            }
        }
        // System.out.println(map);
        for (Character c : map.keySet()) {
            //if(map.get(c)>1) {
            System.out.println(c + " - " + map.get(c));

        }
    }


}

