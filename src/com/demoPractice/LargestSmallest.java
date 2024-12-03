package com.demoPractice;

public class LargestSmallest {
	
	public static void main(String[] args) {
		
		
		int arr[]= {23,56,98,87,43};
		
		int max= arr[0];
		int min =arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]> max) {
				
				max = arr[i];
				
			}else if(arr[i] <min) {
					
				min= arr[i];
			}
			
		}
		System.out.println("max no :"+max);
		System.out.println("min no :"+min);
		
		
		
	}

}
