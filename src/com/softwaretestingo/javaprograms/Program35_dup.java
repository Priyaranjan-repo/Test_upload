package com.softwaretestingo.javaprograms;

public class Program35_dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: Ramakant
		 *
		 * Output: R1a1m1a1k1a1n1t1
		 * 
		 */

		String ip = "Ramakantvhguuugggg";
		String op = "";
	
		int count = 0;

		for (int i = 0; i < ip.length(); i++) {

			for (int j = 0; j < ip.length(); j++) {

				if (ip.charAt(i) == ip.charAt(j)) {

					++count;

				} else {
					op = op + ip.charAt(i) + count;
					count = 1;

				}
				i = j;

			}
		}

		op = op + ip.charAt(ip.length() - 1) + 1;
		System.out.println(op);
	}

}
