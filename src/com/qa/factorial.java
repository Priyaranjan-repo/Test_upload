package com.qa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class factorial {

	public static void main(String[] args) {

//		int num = 6;
//		int factorial = 1;// 6!=6*5*4*3*2
//
//		for (int i = 1; i <= num; i++) {
//			factorial = factorial * i;
//
//		}
//		System.out.println(factorial);
//	}
//
//

		String[] word = { "java", "C", "java", "Python", "C" };

		Set<String> set = new HashSet<String>();

		for (String ss : word) {
			if (set.add(ss) == false) {
				System.out.println(ss);

			}
		}
		System.out.println("-------------------------------");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String sd : word) {
			Integer count = map.get(sd);
			if (count == null) {
				map.put(sd, 1);
			} else {
				map.put(sd, ++count);
			}

		}
	}
}
