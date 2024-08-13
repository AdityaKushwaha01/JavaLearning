package com.learn;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {12,14,16,18,20,23,35,45,56,67,79};
		int li = 0;
		int hi= numbers.length-1;
		int mi = (li+hi)/2;
		int searchvalue = 16;

		while(li<=hi) {
		if (numbers[mi]==searchvalue) {
			System.out.println("the search value found at "+mi);
			break;
		}
		else if(numbers[mi]>searchvalue) {
			hi = mi-1;
		}
		else {
			li=mi+1;
		}
		mi = (li+hi)/2;
	}	
		if(li>hi) {
		System.out.println("Element no present");
		}
}
}