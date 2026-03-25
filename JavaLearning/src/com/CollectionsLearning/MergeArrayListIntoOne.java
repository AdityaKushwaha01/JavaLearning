package com.CollectionsLearning;

import java.util.ArrayList;
import java.util.List;

public class MergeArrayListIntoOne {
	public static void main(String[] args) {
		List<Character> chr= new ArrayList<>();
		chr.add('a');
		chr.add('b');
		chr.add('c');

		List<Integer> inte= new ArrayList<>();
		inte.add(1);
		inte.add(2);
		inte.add(3);       

		List<Object> res = new ArrayList<>();  
		for(int i=0;i<chr.size();i++){
			res.add(chr.get(i));
			res.add(inte.get(i));
		}       
		System.out.println(res);

	}
}



