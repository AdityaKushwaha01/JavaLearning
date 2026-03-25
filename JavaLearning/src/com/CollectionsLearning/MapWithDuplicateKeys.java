package com.CollectionsLearning;

import java.util.HashMap;
import java.util.Map;

public class MapWithDuplicateKeys {


	public static void main(String[] args) {
		Map<String,String> mp = new HashMap<>();
		mp.put("fruit","apple");
		mp.put("fruit","mango");
		mp.put("veg","potato");

		for(Map.Entry<String,String> ent :mp.entrySet()){


			System.out.println(ent.getKey()+"--->"+ent.getValue());
		}
	}

}
