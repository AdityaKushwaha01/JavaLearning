package com.learn;

import java.util.Iterator;

public class SeconbiggestinArray {
	
	public static void main(String[] args) {
		
		int[] num= {12,34,68,97,94,90};
		int temp;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]<num[j]) {
				temp = num[i];
				num[i]=num[j];
				num[j]= temp;
				}
			}
			
			}
//		for (int k : num) {
//			System.out.println(k);
//		}
		System.out.println(num[5]);
		
	}

}
