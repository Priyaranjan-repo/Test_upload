package com.qa.JavaDemoPrg;

public class ArrayEle {
	
	public static void main(String[] args) {
		//60  ,50 40,30,20 10
		int n []= {10,20,30,40,50,60};
		
		int low =0,high =n.length-1;
		
		while(low<high) {
		int temp = n[low];
		n[low]= n[high];
		n[high] = temp;
		
		low ++;
		high--;
		}
		for (int i : n) {
		
		System.out.println(i);
	}

}
}
