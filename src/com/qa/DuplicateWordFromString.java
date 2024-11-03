package com.qa;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordFromString {

	public static void main(String[] args) {
		String str = "Big black bug bit a big black dog on his big black nose";

		String unique = " ";

		Set<String> uniqueitem = new LinkedHashSet<>(List.of(str.split(" ")));

		for (String s1 : uniqueitem) {
			unique = unique + " " + s1;

		}
		System.out.println(unique);

	}
}
