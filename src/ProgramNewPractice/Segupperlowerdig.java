package ProgramNewPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Segupperlowerdig {

	// String s ="New123Demo";
	public static void main(String[] args) {

		// List<char[]> li = Arrays.asList(word);
//
//		List<char[]> sortEle = li.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortEle);

		String name = "Priyaranjan";
		char[] c = name.toLowerCase().toCharArray();

		System.out.println("before sorting: " + name);

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < c.length; i++) {
			list.add(c[i]);
		}
		list = list.stream().sorted().collect(Collectors.toList());

		//list = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		name = "";
		for (int i = 0; i < list.size(); i++) {
			name = name + list.get(i);
		}
		System.out.println("after sorting: " + name);
	}
}
