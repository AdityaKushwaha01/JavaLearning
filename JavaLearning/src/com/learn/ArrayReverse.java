package com.learn;


import java.util.ArrayList;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,20,30,40,50};
		int index=0;
		int[] temp= new int[num.length]; //==> Defining int Array
//		String[] arr1= new String[num.length];==> Defining String Array
//		ArrayList<Integer> al =new ArrayList<Integer>();
//		for (int i = num.length-1; i>=0 ; i--) {
//			al.add(num[i]);
//			
//		}
//		for (Integer integer : al) {
//			System.out.print(" "+integer);
//		}
		for (int i = num.length-1; i>=0 ; i--) {
			temp[index++]= num[i];

		}
		for (int i : temp) {
			System.out.println(i);
		}
		

}
}