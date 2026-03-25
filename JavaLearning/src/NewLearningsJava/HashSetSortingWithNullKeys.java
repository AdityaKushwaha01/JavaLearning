package NewLearningsJava;

import java.util.*;

public class HashSetSortingWithNullKeys {

	public static void main(String[] args) {
		Map<String,Integer> mp = new HashMap<>();
		mp.put("Zebra",10);
		mp.put(null, 50);
		mp.put("Apple", 30);
		mp.put("lemon", 20);
		
		List<Map.Entry<String,Integer>> entries= new ArrayList<>(mp.entrySet());
		
		entries.sort((e1,e2)-> {if(e1.getKey()==null) return -1;
								if(e2.getKey()==null) return 1;
								
								return e1.getKey().compareTo(e2.getKey());
								});
		
		Map<String,Integer> hmp = new LinkedHashMap<>();
		for(Map.Entry<String,Integer> ent:entries) {
			hmp.put(ent.getKey(), ent.getValue());
		}
		
		for (Map.Entry<String, Integer> entry : hmp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
	}

}
