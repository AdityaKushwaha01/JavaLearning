package NewLearningsJava;

import java.util.HashMap;
import java.util.Map;

public class MostAndLeastFreqElementString {

	public static void main(String[] args) {
		String str= "Aditya Kumar Kushwaha".toLowerCase();
        Map<Character,Integer> mp = new HashMap<>();
        for(char c:str.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        char maxfreq = ' ', minfreq = ' ';
        for(Map.Entry<Character,Integer> ent:mp.entrySet()){
            if(ent.getValue()>max){
            	maxfreq=ent.getKey();
                max=ent.getValue();
            }
            else if(ent.getValue()<min) {
            	minfreq=ent.getKey();
            	min=ent.getValue();
            }   
        }
        System.out.println(maxfreq+" "+minfreq);
	}

}
