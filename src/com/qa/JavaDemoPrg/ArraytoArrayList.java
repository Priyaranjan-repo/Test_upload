package com.qa.JavaDemoPrg;

import java.util.ArrayList;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		String colors[] = { "red", "black", "yellow" };

		List<String> li = new ArrayList();

		for (String string : colors) {
			li.add(string);

		}
		System.out.println(li);

	}
}
