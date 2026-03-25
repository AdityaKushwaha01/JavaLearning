package com.CollectionsLearning;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonrepeatingelementString {

	public static void main(String[] args) {
		String str = "swiss";
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		
		for (char c : str.toCharArray()) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		for (char c : str.toCharArray()) {
			if(mp.get(c)==1) {
				System.out.println("1st no repating char is "+c);
				break;
			}
		}

	}

}
