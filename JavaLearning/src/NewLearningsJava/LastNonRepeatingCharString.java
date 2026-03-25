package NewLearningsJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepeatingCharString {

	public static void main(String[] args) {
		String str = "ratcecar";
		
		Map<Character,Integer> mp = new LinkedHashMap<>();
		
		for(char c:str.toCharArray()) {
			mp.put(c,mp.getOrDefault(c, 0)+1);
		}
		//for lastNon Repeating
		char res=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(mp.get(str.charAt(i))==1) {
				res= str.charAt(i);
				System.out.println(res);
				break;
			}
		}
		//for first non repeating
		for(char c:str.toCharArray()) {
			if(mp.get(c)==1) {
				System.out.println(c);
				break;
			}
		}

	}

}
