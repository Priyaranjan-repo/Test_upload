package JAVAPROGRAM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConvertHasmapToArrayList {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("mira", 1);
		map.put("rana", 2);
		map.put("flipkart", 3);
		map.put("amazon", 2);
		System.out.println(map.size());
		System.out.println(map.get(2));
		System.out.println(map.get("mira"));

		Iterator itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			System.out.println(pair.getKey() + " " + pair.getValue());

		}
		System.out.println("-------------------------------------");

		// convert Hashmap To ArrayList
		List<String> listnames = new ArrayList<String>(map.keySet());
		System.out.println(listnames);
		for (String t : listnames) {
			System.out.println(t);

		}
		System.out.println("-------------------------------------");
		//
		List<Integer> listValues = new ArrayList<Integer>(map.values());
		System.out.println(listValues);

		for (Integer i : listValues) {
			System.out.println(i);
		}
	}

}
