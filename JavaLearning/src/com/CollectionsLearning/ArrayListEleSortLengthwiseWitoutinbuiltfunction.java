package com.CollectionsLearning;
import java.util.*;
public class ArrayListEleSortLengthwiseWitoutinbuiltfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Banana");
		arr.add("java");
		arr.add("Automation");
		arr.add("selenium");
		arr.add("Aditya");
		
		for (int i = 0; i < arr.size()-1; i++) {
			for (int j = 0; j < arr.size()-1-i; j++) {
				if (arr.get(j).length()>arr.get(j+1).length()) {
					String temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
					
				}
			}
		}
		System.out.println(arr);

	}

}
