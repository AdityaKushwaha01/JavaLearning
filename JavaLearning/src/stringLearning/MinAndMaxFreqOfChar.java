package stringLearning;

import java.util.HashMap;
import java.util.Map;

public class MinAndMaxFreqOfChar {

	public static void main(String[] args) {
		
		String str ="String Examples sss";
		
		 Map<Character,Integer> mp = new HashMap<>();
	        for(char c:str.toCharArray()){
	            mp.put(c,mp.getOrDefault(c,0)+1);
	        }
	        char mostfreq=str.charAt(0);
	        char minfreq=str.charAt(0);
	        int max=Integer.MIN_VALUE;
	        int min=Integer.MAX_VALUE;
	        for(Map.Entry<Character,Integer> ent:mp.entrySet()){
	            if(ent.getValue()>max){
	                mostfreq=ent.getKey();
	                max=ent.getValue();
	            }
	            else if(ent.getValue()<min) {
	            	minfreq=ent.getKey();
	            	min=ent.getValue();
	            }
	            
	        }
	        
	        System.out.println(mostfreq+" "+minfreq);
	}

}
