package com.CollectionsLearning;

import java.util.ArrayList;
import java.util.List;

public class StringArrayListReverse {

	public static void main(String[] args) {
		List<String> al= new ArrayList<>();
        al.add("Aditya");
        al.add("kumar");
        al.add("kushwaha");
        al.add("java");
        al.add("selenium");
        
        int start =0;
        int last = al.size()-1;
        while(start<last){
            String temp=al.get(start);
            al.set(start,al.get(last));
            al.set(last,temp);
            start++;
            last--;
        }
        
        System.out.println(al);

	}

}
