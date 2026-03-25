package com.learn;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//It works with best with sorted Arrays Only
		int[] numbers = {12,14,16,18,20,23,35,45,56,67,79};
		int start = 0;
		int end= numbers.length-1;
		int mid = (start+end)/2;
		int searchvalue = 16;

		while(start<=end) {
		if (numbers[mid]==searchvalue) {
			System.out.println("the search value found at "+mid);
			break;
		}
		else if(numbers[mid]>searchvalue) {
			end = mid-1;
		}
		else {
			start=mid+1;
		}
		mid = (start+end)/2;
	}	
		if(start>end) {
		System.out.println("Element no present");
		}
}
}