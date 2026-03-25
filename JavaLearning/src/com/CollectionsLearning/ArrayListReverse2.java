package com.CollectionsLearning;

import java.util.ArrayList;

public class ArrayListReverse2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
	    al.add(10);
	    al.add(20);
	    al.add(30);
	    al.add(40);
	    al.add(50);
	    al.add(60);
	    al.add(70);
	    
	    int first=0;
	    int last = al.size()-1;
	    
	    while(first<last){
	        int temp = al.get(first);
	        al.set(first,al.get(last));
	        al.set(last,temp);
	        first++;
	        last--;
	    }
	    System.out.println(al);
	    
	}

}
