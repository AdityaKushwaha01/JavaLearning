package stringLearning;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountWithLetters {

	public static void main(String[] args) {
        String str = "swiss";
        
        Map<Character,Integer> mp = new LinkedHashMap<>();
        
        for (char c :str.toCharArray() ){
            mp.put(c,mp.getOrDefault(c,0)+1);
        } 
        for (Map.Entry<Character,Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
	}
	
	}
}