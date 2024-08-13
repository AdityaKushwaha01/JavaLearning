package com.learn;

public class ArmStrongNo {

	public static void main(String[] args) {
		
		int num= 1533;
		int count=0;
		int num1= num;
		while(num1!=0) {
			count = count +1;	
			num1=num1/10;
		}
		int t1=num;
		int arm =0;
		while(t1!=0) {
			int digit1= t1%10;
			int sum=1;
			for (int i = 1; i <= count ; i++) {
				sum = sum*digit1;
			}
			arm = arm+sum;
			t1= t1/10;
		}
		if(num==arm) {
			System.out.println("Armstrong num");
		}
		else {
			System.out.println("Not armstrong");
		}
	}

}
