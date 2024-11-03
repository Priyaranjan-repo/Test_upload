import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class DeleteRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input-->arr=[37, 32, 97, 37, 37, 32, 62, 35, 76, 62]
		 * 
		 * Output--> [97, 35, 76]
		 */

		int[] no = { 37, 32, 97, 37, 37, 32, 62, 35, 76, 62 };
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < no.length; i++) {
			if (map.containsKey(no[i])) {
				map.put(no[i], map.get(no[i]) + 1);
			} else {
				map.put(no[i], 1);
			}
		}

		List<Integer> list = new LinkedList<Integer>();
		for (Integer i : map.keySet()) {
			if (map.get(i) == 1) {
				// list.add(i);
			}
		}
		// Object[] nos = list.toArray();
		System.out.println(Arrays.toString(no));
		// System.out.println(Arrays.toString(nos));

	}

}
