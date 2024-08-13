package com.learn;

public class ArraySorting {

	public static void main(String[] args) {

		int[] num = {12,56,90,43,67,687,40,69};
		int temp;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]<num[j]) {
					temp= num[i];
					num[i]=num[j];
					num[j]= temp;
				}
			}	
		}
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}
	}
}


