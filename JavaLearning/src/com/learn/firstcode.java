package com.learn;

public class firstcode {

	public static void main(String[] args) {

		int[] num = {12,14,35,67,97,57,60,14,20};

		for(int i=0;i<num.length-1;i++){
			for (int j = 0; j < num.length-1; j++) {
				if(num[i]==num[j] && i!=j) {
					System.out.println(num[j]);

				}
			}

		}
	}

}
