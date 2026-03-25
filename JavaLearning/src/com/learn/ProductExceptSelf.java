package com.learn;

import java.util.Arrays;

public class ProductExceptSelf {

	 public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] result = new int[n];
	        
	        // Step 1: Calculate left side element product for each element
	        int left = 1;
	        for (int i = 0; i < n; i++) {
	            result[i] = left;
	            left *= nums[i];
	        }
	        
	        // Step 2: Calculate right side element product for each element and multiply with the left
	        int right = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] *= right;
	            right *= nums[i];
	        }
	        
	        return result;
	    }
	 //easy way
	 public static int[] productExceptSelfEasy(int[] arr) {
	       int[] res=new int[arr.length];
	       int finalMult=1;
	        for( int i=0;i<arr.length;i++){
	                finalMult*=arr[i];
	        }	        
	        int j=0;
	        for(int i=0;i<arr.length;i++){
	            res[j]=finalMult/arr[i];
	            j++;
	        }
	        return res;
	 }

	    public static void main(String[] args) {
	        int[] nums = {1, 2, 3, 4};
	        int[] output = productExceptSelf(nums);
	        int[] output2 = productExceptSelfEasy(nums);
	        System.out.println("Output: " + Arrays.toString(output2));
	    }
}
