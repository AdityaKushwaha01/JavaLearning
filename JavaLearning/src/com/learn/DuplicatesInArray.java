package com.learn;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] num = {12,56,12,43,67,56,40,43};

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[j]);
				}
			}
			
		}

	}

}
