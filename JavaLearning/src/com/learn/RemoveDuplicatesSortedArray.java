package com.learn;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		
	    int[] arr = {1, 2 ,2 ,3, 4 ,5, 5, 6, 7, 7, 8 ,9 };
	    int j =0;
	    for (int i =0;i<arr.length-1 ;i++ ){
	        if (arr[i]!=arr[i+1]){
	            arr[j]=arr[i];
	            j++;
	        }
	    }
	    arr[j]=arr[arr.length-1];
	    j++;
	    for (int k=0;k<j;k++ ) {
	        System.out.println(arr[k]+" ");
	    }
	}

}
