package com.qa.JavaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection {

	public static void main(String[] args) {

		/*
		 * List<String> li = new ArrayList<String>();
		 * 
		 * li.add("aAaA"); li.add("AaA"); li.add("aAaAa"); li.add("AaaAa"); //
		 * li.add("aAaA"); Collections.sort(li); for (String s : li) {
		 * System.out.print(s + " "); }
		 * 
		 * }
		 * 
		 * }
		 */

		List li = new ArrayList<>();

		li.add("5");
		li.add("20");
		li.add("45");
		li.add("562");
		Collections.sort(li);

		for (int i = 0; i < li.size(); i++) {

			System.out.print(" " + li.get(i));
		}
	}
}
