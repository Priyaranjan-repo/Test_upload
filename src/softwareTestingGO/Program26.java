package softwareTestingGO;

import java.util.LinkedList;
import java.util.List;

public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input: [looking, you, handsome, are]
		// Output: [you, are, looking, handsome]

		String arr[] = { "looking", "you", "handsome", "are" };

		String op = "";
		List<String> listOdd = new LinkedList();
		List<String> listEven = new LinkedList();

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 1) {
				listOdd.add(arr[i]);
			} else {
				listEven.add(arr[i]);
			}

		}

		System.out.println(listEven);
		System.out.println(listOdd);
		listOdd.addAll(listEven);

		Object[] array = listOdd.toArray();
		for (Object o : array) {
			System.out.println(o.toString() + " ");

		}

	}
}
