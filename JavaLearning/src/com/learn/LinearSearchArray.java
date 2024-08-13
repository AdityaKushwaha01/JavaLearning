package com.learn;

public class LinearSearchArray {

	public static void main(String[] args) {
		int[] num = {10,4,30,57};
		int val = 30;
		int count=0;
		for (int i = 0; i < num.length; i++) {
			if (num[i]==val) {
				System.out.println("Value is present at " + i+" index position" );
				count= count+1;
			}
		}
		if(count==0) {
			System.out.println("Item not found");
		}
		
	}

}
