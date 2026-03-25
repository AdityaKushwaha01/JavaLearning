package com.learn;

public class ArmStrongNoEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 153;
		int temp,sum=0,digit;
		
		temp = num;
		while(num>0) {
			digit = num%10;
			num=num/10;
			sum = sum+(digit*digit*digit);
		}
		
		if(temp==sum) {
			System.out.println("Armstrong no");
		}
		else {
			System.out.println("Not armstron no ");
		}
	}

}
