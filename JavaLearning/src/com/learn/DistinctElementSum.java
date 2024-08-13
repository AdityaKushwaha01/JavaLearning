package com.learn;

import java.util.HashSet;

public class DistinctElementSum {

	public static void main(String[] args) {
		int[] input = {5,1,8,4,9,1,5};
		int sum=0;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			hs.add(input[i]);
		}
		
		for (Integer integer : hs) {
			sum= sum+integer;
		}
		System.out.println(sum);
	}

}
