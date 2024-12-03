package com.qa.JavaDemoPrg;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInArray {
		public static void main(String[] args) {
		int[] a = new int[] {1,4,2,3,1,55,6};
                boolean flag = false;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				System.out.println("The first duplicate in array is :" + a[i]);
				flag=true;
			}else {
				map.put(a[i], 1);
			}
		}
		if(!flag)
			System.out.println("No duplicate found");
	}
}


