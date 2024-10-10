package JAVAPROGRAM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	static String name;
	static int i;

	public static void main(String[] args) {
		System.out.println(name);

		System.out.println(i);

		ArrayList<String> al = new ArrayList<String>();
		al.add("miyt");
		al.add("figh");
		al.add("grow");
		al.add("phone");
		System.out.println(al.size());

		System.out.println("---using for loop");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Using Java 8----------------------");

		// java 8
		al.forEach(ele -> {
			System.out.println(ele);

		});
		System.out.println("-------------------");

//using iterator:
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("---------------------------------------------");
		for (String s : al) {
			System.out.println(s);
		}

		// using lis iterator() to travese in both the directiond
		System.out.println("-----using list iterator() to travese in both the directiond-----");
		ListIterator<String> listitr = al.listIterator(al.size());
		while (listitr.hasPrevious()) {
			String s1 = listitr.previous();
			System.out.println(s1);
		}
	}
}