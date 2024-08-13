package com.learn;

public class AnnonymousArray {
	// We use anonymous array when we need it for single time use 
	public static void main(String[] args) {
		AnnonymousArray.sum(new int[]{10,20,30,50});

	}
	static void sum(int[] no) {
		int total = 0;
		for (int i : no) {
			total = total+i;
		}
		System.out.println(total);
	}
}
