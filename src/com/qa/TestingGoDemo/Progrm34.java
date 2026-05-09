//	 Input: [2, 1, 1, 4, 5, 5, 6, 7]

//	          Output: [2, 4, 6, 7]
package com.qa.TestingGoDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Progrm34 {

	public static void main(String[] args) {

		int Input[] = { 2, 1, 1, 4, 5, 5, 6, 7 };

		List<Integer> li = new ArrayList<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		String op = " ";
		for (int i = 0; i < Input.length; i++) {

			if (map.containsKey(Input[i])) {
				map.put(Input[i], map.get(Input[i]) + 1);
			} else {
				map.put(Input[i], 1);

			}
		}
		// System.out.println(map);

		for (Integer d : map.keySet()) {
			if (map.get(d) == 1) {
				System.out.print(d + " ");
			}
		}

	}

}

//for (Integer in : map.keySet()) {
//    if (map.get(in) == 1) {
//        list.add(in);
//    }
//}
//System.out.println(list);
//}