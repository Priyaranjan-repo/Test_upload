package com.qa;

import java.util.Arrays;

public class countNoword {

	public static void main(String[] args) {

		String str = "count WordsWith Punctuatio kdjk";

		long count = Arrays.stream(str.split("\\s")).count();
		System.out.println(count);

	}

}
