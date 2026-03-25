package com.learn;


public class Practices {
	public static void main(String[] args) {

		for(int i =2;i<=20;i++) {
			for (int j = 2; j <=Math.sqrt(i); j++) {
				if(i%j==0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}

//input: [1,2,3,4,5,6 ,7] and n=3;
//Output: [5,6,7,1,2,3,4]