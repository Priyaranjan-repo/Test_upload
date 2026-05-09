package StringChallange;

import java.util.LinkedHashMap;
import java.util.Map;

public class HshmapExample {

	public static void main(String[] args) {

		Map<String, Integer> linkedMap = new LinkedHashMap<>();

		linkedMap.put("A", 1);
		linkedMap.put("C", 3);
		linkedMap.put("B", 2);

		linkedMap.put("B", 2);
		linkedMap.put("null", 2);
		linkedMap.put("rahul", 2);

		System.out.println(linkedMap); // Output: {A=1, C=3, B=2} → Preserved order
		
		
//		//linkedMap.stre
//	     .filter(name -> name.startsWith("C"))
//	     .forEach(System.out::println);

	}
}
