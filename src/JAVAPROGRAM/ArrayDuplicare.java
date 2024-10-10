package JAVAPROGRAM;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicare {

	public static void main(String[] args) {

		/*
		 * String[] names = { "java", "ruby", "python", "java" };
		 * 
		 * boolean flag = false;
		 * 
		 * for (int i = 0; i < names.length; i++) {
		 * 
		 * for (int j = i + 1; j < names.length; j++) {
		 * 
		 * if (names[i].equals(names[j])) {
		 * 
		 * System.out.println("Duplicate element in array:" + names[i]); // boolean flag
		 * = false; } } } } }
		 */

//using hashset

		String[] names = { "java", "ruby", "ruby", "python", "java" };

		Set<String> set = new HashSet<String>();

		for (String s : names) {

			if (set.add(s) == false) {

				System.out.println("Duplicate element in array:" + s);

			}
		}
	}
}