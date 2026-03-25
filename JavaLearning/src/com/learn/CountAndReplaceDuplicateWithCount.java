package com.learn;

import java.util.HashMap;
import java.util.Map;

public class CountAndReplaceDuplicateWithCount {

	public static void main(String[] args) {
		
		String str1 = "Automation".toLowerCase();
		String str= str1.toLowerCase();
        StringBuilder sb = new StringBuilder();
        //Output = 2u22m22i2n
        Map<Character,Integer> mp = new HashMap<>();
        for(char c :str.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);

        }
        for(char c :str.toCharArray()) {
        	if(mp.get(c)>=2) {
        		sb.append(mp.get(c));
        	}
        	else {
        		sb.append(c);
        	}
        }
        System.out.println(sb.toString());
	}

}
