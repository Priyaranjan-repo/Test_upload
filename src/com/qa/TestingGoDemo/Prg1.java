package com.qa.TestingGoDemo;

public class Prg1 {

	public static void main(String[] args) {

		String[] s = { "Rama", "Test", "Type", "Tata" };

		// Expected: RTTTaeyamsptatea

		String op = "";

		for (int i = 0; i < s.length; i++) {

			for (int j = 0; j < s.length; j++) {

				op = op + s[j].charAt(i);

			}

		}

		System.out.println(op.toString());

	}
}
