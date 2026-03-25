package com.learn;

import java.util.HashSet;
import java.util.Set;

public class PrintindexOfDigitsToSum {

	public static void main(String[] args) {
		int[] num = {3,2,4};
		int tar = 6;
		Set<Integer> hs=new HashSet<>();
		//output =1,2

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]+num[j]==tar && i!=j) {
					hs.add(i);
					hs.add(j);
				}
			}
		}
		System.out.println(hs);

	}

}
