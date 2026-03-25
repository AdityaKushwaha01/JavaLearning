package com.learn;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8};

		int k =5;
        arrayrotation(nums,k);
        for (int l :nums ){
            System.out.print(l+" ");
        } 
	}
     static void arrayrotation(int[] arr,int k) {

		for(int j=0; j<k; j++) {
			int first=arr[0];
			for (int i=0; i<arr.length-1 ; i++ ) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=first;
		}
	}
}
