package stringLearning;

import java.util.HashMap;
import java.util.Map;

public class MinAndMaxFreqOfChar {

	public static void main(String[] args) {
		
		String str ="String Examples sss";
		
		Map<Character, Integer> charfrq =  new HashMap<>();
		
		for (char c : str.toCharArray()) {
			charfrq.put(c,charfrq.getOrDefault(c, 0) +1);
			
		}
		char minChar = '\0', maxChar = '\0';
		int minfreq = Integer.MAX_VALUE,maxfreq = Integer.MIN_VALUE;
		
		
		for (Map.Entry<Character, Integer> entry : charfrq.entrySet()) {
			int frequency = entry.getValue();
			char character = entry.getKey();
			
			
			if (frequency<minfreq) {
				minfreq =frequency;
				minChar = character;
			}
			if (frequency>maxfreq) {
				maxfreq =frequency;
				maxChar = character;
			}
		}
		System.out.println(minChar +" "+minfreq);
		System.out.println(maxChar +" "+maxfreq);
	}

}
