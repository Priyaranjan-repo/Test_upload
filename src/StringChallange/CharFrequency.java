package StringChallange;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
	
	
	private static Object ch=null;

	    
	    public static void main(String[] args) {
		
	    	String input = "sdetinterview";
		
	    	Map<Character, Integer> map = new HashMap<>();

		for (char ch : input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
				
		}

		//print k and v  with nos
		
		
		map.forEach((k, v) -> System.out.println(k+" -- "+v));
		
		}

		
	}

