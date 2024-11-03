
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class RemoveRepeatedElements {

	// output :[97, 35, 76]
	public static void main(String[] args) {
		// Input array
		int[] arr = { 37, 32, 97, 37, 37, 32, 62, 35, 76, 62 };

		List<Integer> result = removeRepeated(arr);

		System.out.println(result);
	}

	public static List<Integer> removeRepeated(int[] arr) {
		// Create a HashMap to store frequency of each element
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		// Fill the frequency map
		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}

		// Create a list to store elements that are not repeated

		List<Integer> li = new LinkedList<Integer>();

		// Add elements to the list which appeared only once
		for (int num : arr) {
			if (freqMap.get(num) == 1) {
				li.add(num);

			}
		}

		return li;
	}

}
