 package com.learn;

public class DistinctElementSumwithoutinbuiltfunction {

	public static void main(String[] args) {
		int[] arr = {5,1,8,4,9,1,5};
		int sum =0;
		for (int i=0;i<arr.length-1 ;i++ ){
		    for(int j =0;j<arr.length-1-i;j++){
		        if(arr[j]>arr[j+1]){
		            int temp = arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		                      		        }
		    }
		}
		int l=0;
		for (int i=0;i<arr.length-1 ;i++ ){
		    if(arr[i]!=arr[i+1]){
		        arr[l]=arr[i];
		        l++;
		    }
		}
		arr[l]=arr[arr.length-1];
		l++;
		for (int k=0;k<l;k++ ){
		    sum=sum+arr[k];   
		} 
		System.out.print(sum+" ");
	}
}
