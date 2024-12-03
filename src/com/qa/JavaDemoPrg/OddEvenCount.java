package com.qa.JavaDemoPrg;

public class OddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 544233793;
		int OddCount= 0;
		int EvenCount =0;
	while(n>0) {
		
		int rem = n%10;
		
		if(rem%2 ==0) {
			EvenCount++;
		}
		else 
			OddCount++;
			n= n/10;
		}
		

	System.out.println(OddCount);
	System.out.println(EvenCount);

	}	}

