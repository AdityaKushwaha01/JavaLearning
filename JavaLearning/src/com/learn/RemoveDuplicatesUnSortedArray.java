package com.learn;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUnSortedArray {

	public static void main(String[] args) {
		
	    int[] arr = {1,2,2,3,4,4,5,6};
	    Set<Integer> hs = new HashSet<>();
	    
	    for (int k=0;k<arr.length;k++ ) {
	        if(!hs.contains(arr[k])){
	            hs.add(arr[k]);
	        }
	    }
	    System.out.println(hs);
	}

}
