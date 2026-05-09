package Interview;

import java.util.Map;
import java.util.TreeMap;

public class PrintTreeMap {
	public static void main(String[] args) {
		// Creating a TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<>();

		// Adding elements to TreeMap
		treeMap.put(3, "Apple");
		treeMap.put(1, "Banana");
		treeMap.put(5, "Cherry");
		treeMap.put(2, "Date");
		treeMap.put(4, "Elderberry");

		System.out.println("TreeMap elements:");

		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		System.out.println("--------------------");

		treeMap.forEach((k, vue) -> System.out.println(k + " -- " + vue));

	}

}
