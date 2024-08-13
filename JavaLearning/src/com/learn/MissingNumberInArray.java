package com.learn;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4,6};
		int expElecount= num.length+1; 
		
		int tSum= (expElecount *(expElecount+1))/2;
		int sum =0;
		
		for (int i = 0; i < num.length; i++) {
			sum = sum+num[i];
		}
		System.out.println("Missing element is " +(tSum-sum));
		

	}

}
