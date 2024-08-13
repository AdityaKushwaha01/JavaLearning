package com.learn;

public class Factorial {

	public static void main(String[] args) {
		int n=10,fact=1;
		if(n==0) {
			System.out.println("factorial is 1");
		}
		for (int i = n; i >=1; i--) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
