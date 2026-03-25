package com.CollectionsLearning;

import java.util.*;

public class RemoveDuplicatesArraylist {

	public static void main(String[] args) {
	    ArrayList<Integer> arr = new ArrayList<>();
	    arr.add(10);
	    arr.add(10);
	    arr.add(20);
	    arr.add(30);
	    arr.add(30);
	    arr.add(40);
	    arr.add(40);
	    arr.add(50);
	    
//	    ArrayList<Integer> unique = new ArrayList<>();
	  
//	    for (int i =0;i<arr.size() ;i++ ){
//	        if(!unique.contains(arr.get(i))){
//	            unique.add(arr.get(i));
//	        }
//	    } 
	    Set<Integer> st = new LinkedHashSet<>(arr);
	    
	    System.out.println(st);
}
}
