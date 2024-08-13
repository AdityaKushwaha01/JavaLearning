package com.learn;

public class NonRepeatingElementArray {

	public static void main(String[] args) {
		
		int[] num = {1,1,5,5,2,2,3,3,6};
		int res = num[0];
		for (int i = 1; i < num.length; i++) {
			 res = res^num[i];
		}
		System.out.println(res);
		
		}

	}


