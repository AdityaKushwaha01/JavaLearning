package NewLearningsJava;

import java.util.HashMap;
import java.util.Map;

public class MapWithInMap {

	public static void main(String[] args) {
		
		Map<Character,Integer> mp1 = new HashMap<Character, Integer>();
		mp1.put('A', 10);
		mp1.put('B', 20);
		
		Map<Character,Object> mp2 = new HashMap<Character, Object>();
		mp2.put('C', 30);
		mp2.put('D', mp1);
		mp2.put('E', 50);
		
		System.out.println(mp2);
	}

}
