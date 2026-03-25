package com.learn;

public class SecLargestinArraywithoutSorting {

	public static void main(String[] args) {
	    int[] arr = {1,5,6,3,8,9,4};
	    int largest = arr[0], seclargest = arr[0];
	    
	    for (int i =0;i<arr.length ;i++ ){
	        if(arr[i]>largest){
	            seclargest=largest;
	            largest=arr[i];
	        }
	        else if(arr[i]>seclargest && arr[i]!=largest){
	            seclargest=arr[i];
	        }
	        
	    } 
	    System.out.println(seclargest);
	    
	}

}
