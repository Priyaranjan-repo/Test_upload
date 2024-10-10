package JAVAPROGRAM;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {/*
								 * 
								 * public static void main(String[] args) {
								 * 
								 * String names[] = { "mita", "rita", "Giyatri", "mita" };
								 * 
								 * for (int i = 0; i < names.length; i++) { for (int j = i + 1; j <
								 * names.length; j++) {
								 * 
								 * if (names[i].equals(names[j])) { System.out.println("Duplicate element is :"
								 * + names[i]);
								 * 
								 * } } }
								 * 
								 * }
								 * 
								 * }
								 */
	// using hashset

	public static void main(String[] args) {
		String names[] = { "mita", "rita", "Gayatri", "mita" };

		Set<String> set = new HashSet<String>();
		for (String s : names) {
			if (set.add(s) == false) {

				System.out.println("Duplicate element is:" + s);
			}

		}

	}
}

/*
 * //using hashmap Map<String,Integer> map = new HashMap<String, Integer>();
 * 
 * for(String str:names) { int count = map.get(str); if(count== null) {
 * map.put(str, 1); }else { map.put(str,count++);
 * 
 * }
 */
