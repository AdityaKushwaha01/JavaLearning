package com.learn;

import java.util.Arrays;

public class MergeAndSortArrayLeetCode {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3; 
		int[] nums2 = {2,5,6};
		
		for (int k = 0; k < nums2.length; k++) {
			nums1[m]=nums2[k];
			m++;
			
		}
		for (int j = 0; j < nums1.length; j++) {
			for (int j2 = 0; j2 < nums2.length; j2++) {
				if(nums1[j]<nums1[j2]) {
					int temp = nums1[j];
					nums1[j]=nums1[j2];
					nums1[j2]=temp;
					
				}
				
			}
		}
		for (int c : nums1) {
			System.out.println(c);
		}
	}

}
 