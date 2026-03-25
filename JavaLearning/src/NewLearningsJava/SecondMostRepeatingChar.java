package NewLearningsJava;
import java.util.*;
public class SecondMostRepeatingChar {
	public static void main(String[] args) {
		String str ="javaaj";
		Map<Character, Integer> mp = new HashMap<>();
		for(char c:str.toCharArray()){
			mp.put(c,mp.getOrDefault(c,0)+1);
		}
		int fir=0,sec=0;
		char firChar=' ',secChar=' ';
		for(Map.Entry<Character,Integer> ent:mp.entrySet()){
			int freq = ent.getValue();

			if(freq>fir){
				sec=fir;
				secChar=firChar;
				fir=freq;
				firChar=ent.getKey();
			}
			else if(freq>sec && freq!=fir){
				sec=freq;
				secChar=ent.getKey();
			}
		}
		if(sec>0){
			System.out.println(secChar);
		}
	}
}
