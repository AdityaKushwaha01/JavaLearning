package com.learn;

public class MergeTwoArrays {
	public static void main(String[] args) {
        int[] arr1 = {5, 3, 2};
        int[] arr2 = {9, 0, 1};
        
        int[] res = new int[arr1.length+arr2.length];
        int index=0;
        for(int i =0;i<arr1.length;i++){
            res[index]=arr1[i];
            index++;
            
        }
        for(int i =0;i<arr2.length;i++){
            res[index]=arr2[i];
            index++;
            
        }
        for(int i:res){
        System.out.println(i);
        } 
    }
}
