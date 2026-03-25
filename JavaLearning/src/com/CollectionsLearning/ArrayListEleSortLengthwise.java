package com.CollectionsLearning;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ArrayListEleSortLengthwise {

	public static void main(String[] args) {
		
		        // Create an ArrayList of strings
		        ArrayList<String> strings = new ArrayList<>();
		        strings.add("apple");
		        strings.add("banana");
		        strings.add("kiwi");
		        strings.add("grapefruit");
		        strings.add("orange");

		        // Sort using a custom comparator
//		        Collections.sort(strings, new Comparator<String>() {
//		            
//		            public int compare(String s1, String s2) {
//		                return Integer.compare(s1.length(), s2.length());
//		            }
//		        });
		        strings.sort((a,b)->a.length()-b.length());
		     //   strings.sort(Comparator.comparing(e->e.length()));
		        // Alternatively, use lambda expressions (Java 8 and later)
		        // strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		        // Print the sorted list
		        System.out.println("Sorted by length: " + strings);
		    }

	}


