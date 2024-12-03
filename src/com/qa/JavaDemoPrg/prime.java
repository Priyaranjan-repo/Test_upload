package com.qa.JavaDemoPrg;

public class prime {
	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			
		
	
		checkPrime(i);		
		}	
		
	}
	public static void checkPrime(int n) {
		
	
		boolean isPrime = true;
		//int n = 71;
		
for (int i = 2; i <=n/2; i++) {
	
	if(n%i==0) {
	isPrime = false;
		
	}
	
}		
if(!isPrime) {
	System.out.println("prime");
}else {
	System.out.println("Non prime ");
}
	}
}


