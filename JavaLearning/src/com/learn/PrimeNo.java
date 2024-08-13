package com.learn;

public class PrimeNo {

	public static void main(String[] args) {
		
		int no =113, count=0;
		
		for (int i = 2; i <= no-1; i++) {
			if(no%i ==0) {
				count= count+1;
			}
				
		}
		if(count>0) {
			System.out.println("Not a prime no ");
		}
		else {
			System.out.println("Prime no ");
		}

	}

}
