package com.learn;


import java.util.ArrayList;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40,50};
		int first = 0;
		int last = num.length-1;
		while(first<last) {
			int temp = num[first];
			num[first]= num[last];
			num[last] = temp;
			first++;
			last--;
		}
		
		for (int i : num) {
			System.out.println(i);
		}
		

}
}