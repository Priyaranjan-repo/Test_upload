package com.qa.JavaPractice;

import java.util.HashMap;

public class CharacterFrequency {

	public static void main(String[] args) {
		String str = "Welcome to Selemium Interview";

		// Call the method to count character frequencies
		countCharFreq(str);
	}

	public static void countCharFreq(String str) {

		// Create a HashMap to store the frequency of each character

		HashMap<Character, Integer> frequencyMap = new HashMap<>();

		str = str.toLowerCase(); // Convert the string to lowercase to treat 'C' and 'c' as the same character

		// Loop through each character in the string
		for (char ch : str.toCharArray()) {
			// Ignore spaces
			if (ch != ' ') {
				// If the character is already in the map, increment its count
				frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
			}
		}
		// Print the frequency of each character
		System.out.println("Character Frequencies:");

		for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
		}
	}
}

//----------------------------
/*
 * HashMap<Character, Integer> map = new HashMap<>();
 * 
 * Character[] n = null;for( Character num:n) {
 * 
 * if (map.containsKey(num)) { map.put(num, map.get(num) + 1); } else {
 * 
 * map.put(num, 1); } } // Print the frequency of each number for(
 * Entry<Character, Integer> entry:map.entrySet()) {
 * System.out.println(entry.getKey() + " - " + entry.getValue() + " times"); }
 * 
 * }}
 */