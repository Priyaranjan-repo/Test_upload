package Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatChar {

    public static void main(String[] args) {

        String s = "abbcdedddere";

        Map<Character, Integer> map = new LinkedHashMap<>();

        // count frequency
        for (char c : s.toCharArray()) {
           if(map.containsKey(c)){
            map.put(c, map.get(c) + 1);
        }
        else{
            map.put(c, 1);
        }
    }

//
//        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() >= 1) {
//                System.out.println("First non-repeating char: " + entry.getKey());
//                break;
//            }

            for (Character ch : map.keySet()) {
                if (map.get(ch) == 1) {
                    System.out.println("First non-repeating char: " + ch);
                    break;
                }
        }
    }
}



