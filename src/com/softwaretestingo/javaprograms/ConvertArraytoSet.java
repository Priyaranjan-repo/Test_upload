package com.softwaretestingo.javaprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertArraytoSet {

	public static void main(String[] args) {


		Integer arr[] = { 2, 3, 3, 4, 5, 4, 4, 5, 3, 2, 8 };

		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));

		System.out.println(set);

	}

}
