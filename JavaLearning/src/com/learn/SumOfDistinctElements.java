package com.learn;

import java.util.HashSet;

public class SumOfDistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,1,8,4,9,1,5};
		int sum=0;
		HashSet<Integer> hs= new HashSet<Integer>();
		
		for (int i = 0; i < input.length-1; i++) {
				hs.add(input[i]);
			}
		for (Integer intg : hs) {
			sum = sum + intg;
			
		}
		System.out.println(sum);

		}
 
	}
