package com.CollectionsLearning;

import java.util.ArrayList;

public class IntegerArraylistSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(15);
		arr.add(5);
		arr.add(14);

		//	    arr.sort((a,b)->a-b);
		for (int j =0;j<arr.size()-1 ;j++ ) {
			for (int i =0;i<arr.size()-1-j ;i++ ){

				if (arr.get(i)>arr.get(i+1)) {
					int temp;
					temp=arr.get(i);
					arr.set(i,arr.get(i+1));
					arr.set(i+1,temp);
				} 
			} 
		}
		System.out.println(arr);


	}

}
