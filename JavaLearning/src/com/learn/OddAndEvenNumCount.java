package com.learn;

public class OddAndEvenNumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5,6,7,8,9};
		int oddcount=0,Evencount=0;
		for (int i = 0; i < input.length; i++) {
			if (input[i]%2==0) {
				Evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("Even elements count is "+ Evencount);
		System.out.println("Odd elements count is "+oddcount);
	}

}
