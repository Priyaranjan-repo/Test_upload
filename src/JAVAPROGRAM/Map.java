package JAVAPROGRAM;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(12, "nilima");
		map.put(15, "kaly");
		map.put(17, "mily");

		// System.out.println(map);
		System.out.println(map.get(12));
		System.out.println(map.entrySet());

		for (var r : map.keySet()) {
			System.out.println(r);
		}

		System.out.println("printing values ----------------");
		for (var e : map.values()) {
			System.out.println(e);
		}

	}
}
