package com.learn;
import java.util.*;
import java.util.Map.Entry;
public class NonRepeatingElementArray {

	public static void main(String[] args) {
		
		int[] num = {1,1,5,9,5,2,2,3,3,6};
		
		Map<Integer, Integer> mp =new HashMap<>();
		
		for(int c:num) {
			mp.put(c, mp.getOrDefault(c, 0)+1);
		}
		//for(Entry<Integer, Integer> ent:mp.entrySet()) {
		//	System.out.println(ent.getKey()+"-->"+ent.getValue());
		//}
		for(int c:num) {
			if(mp.get(c)==1) {
				System.out.println("Non repeating element is "+c);
			}
		}	
		
		
		}

	}


