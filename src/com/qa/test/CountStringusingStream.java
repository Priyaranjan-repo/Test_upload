package com.qa.test;

import java.util.Arrays;

public class CountStringusingStream {

	public static void main(String[] args) {

		String str = "I am  leatnind haindoi";

		long count = Arrays.stream(str.split("\\s")).count();
		System.out.println(count);
	}

}
