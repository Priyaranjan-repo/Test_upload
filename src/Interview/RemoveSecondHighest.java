package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveSecondHighest {
	public static void main(String[] args) {
		// Creating a HashMap with sample values
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 40);
		map.put(3, 30);
		map.put(4, 20);
		map.put(5, 50);

		System.out.println("Original HashMap: " + map);

		// Remove second highest value
		removeSecondHighest(map);

		System.out.println("HashMap after removing second highest element: " + map);
	}

	public static void removeSecondHighest(HashMap<Integer, Integer> map) {
		if (map.size() < 2) {
			System.out.println("Not enough elements to remove second highest.");
			return;
		}

		// Get all values and sort them in descending order
		List<Integer> values = new ArrayList<>(map.values());
		Collections.sort(values, Collections.reverseOrder());

		// Find the second highest value
		int secondHighest = values.get(1);

		// Find and remove the key associated with the second highest value
		Integer keyToRemove = null;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == secondHighest) {
				keyToRemove = entry.getKey();
				break;
			}
		}

		if (keyToRemove != null) {
			map.remove(keyToRemove);
		}
	}
}
