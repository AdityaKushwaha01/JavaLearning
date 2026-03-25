package companies.interview.questions;

import java.util.*;

public class Coforge {

	public static void main(String[] args) {
		String str="aBGkOfCrps";
		Map<Character,Integer> mp = new LinkedHashMap<>();
		for(char c:str.toCharArray()) {
			mp.put(c, mp.getOrDefault(c,0)+1);
		}
		for(char c:str.toCharArray()) {
			if(mp.get(c)==1) {
				System.out.println(c);
				break;
			}
		}
		

	}

}
