package JAVAPROGRAM;

import java.util.ArrayList;

public class ArraylistExam {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(34);
		al.add(443);
		al.add(43);
		al.add(23);
		al.add(656);

		// for (int i = 0; i < al.size(); i++) {
		// System.out.println(al.get(i));

		for (var i : al) {

			System.out.println("values are :" + i);
		}

	}

}

/*
 * Array - fixed in size objects and primitive data stored.
 */

//Arraylist - store only objects
