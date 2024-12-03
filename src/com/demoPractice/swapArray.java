package com.demoPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class swapArray {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(2);
		li.add(4);
		li.add(67);
		li.add(54);
		System.out.println("Before swapping:"+li);
		Collections.swap(li, 1, 3);
		System.out.println("After swapping"+li);
		
	}

}
